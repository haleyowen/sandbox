require 'mailgun'
HorseSite::App.controllers do

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

    @user = User.new(email: email, password: password);
    if @user.save
      session[:user] = @user.id
      redirect :index, :layout => :layout
    else
      erb "oh, no!"
    end
  end

end
