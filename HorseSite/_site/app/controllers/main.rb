require 'mailgun'
require 'sinatra/flash'
require 'sinatra/formkeeper'

HorseSite::App.controllers do
  register Sinatra::FormKeeper 
  # get :index, :map => '/foo/bar' do
  #   session[:foo] = 'bar'
  #   render 'index'
  # end

  # get :sample, :map => '/sample/url', :provides => [:any, :js] do
  #   case content_type
  #     when :js then ...
  #     else ...
  # end

  # get :foo, :with => :id do
  #   'Maps to url '/foo/#{params[:id]}''
  # end

  # get '/example' do
  #   'Hello world!'
  # end

  get '/' do
    erb :index, :layout => :layout
  end

  get '/prices' do 
    erb :prices, :layout => :layout
  end

  get '/account' do
    erb :account, :layout => :layout
  end

  get '/contact' do
    erb :contact, :layout => :layout
  end

  post '/contact' do
    name = params['name']
    email = params['email']
    subject = params['subject']
    message = params['message']

    mg_client = Mailgun::Client.new "key-1jky1amz35l6alxzs3hsmup-l0ysuuy6"

    message_params = {:from => 'equinemarket@sandbox2c9ea1363ec0428098d69937d3e68a3a.mailgun.org',
      :to => 'haley.owen21@gmail.com',
      :subject => subject,
      :text => "Name: " + name + "\nEmail Address: " + email + "\nMessage: " + message}

    mg_client.send_message "sandbox2c9ea1363ec0428098d69937d3e68a3a.mailgun.org", message_params

    erb :thanks, :layout => :layout
  end

  get '/register' do
    erb :register, :layout => :layout
  end

  post '/register' do
    email = params['email']
    password = params['password']

    form do
      filters :strip
      field :email, :present => true
      field :password, :present => true
      field :password_confirm, :present => true
      same :same_password, [:password, :password_confirm]
    end

    if form.failed?
      output = erb :register, :layout => :layout
      fill_in_form(output)
    else
      @user = User.new(email: email, password: password);
      if @user.save
        session[:user] = @user.id
        redirect '/'
      else
        erb "oh, no!"
      end
    end
  end

  get '/login' do
    erb :login, :layout => :layout, :locals => {:message => nil}
  end

  post '/login' do
    @user = User.first(:email => params['email'])
    if @user.nil? then
      output = erb :login, :layout => :layout, :locals => {:message => "Your email or password was incorrect."}
      fill_in_form(output)
    else
      @user_hash = BCrypt::Password.new(@user.password)
      if @user_hash == params['password'] then
        session[:user] = @user.id
        redirect '/'
      else
        output = erb :login, :layout => :layout, :locals => {:message => "Your email or password was incorrect."}
        fill_in_form(output)
      end
    end
  end

  get '/logout' do
    session[:user] = nil
    redirect '/'
  end

end
