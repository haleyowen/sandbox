require 'sinatra/formkeeper'
HorseSite::App.controllers :ads do
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

  get '/search' do
    erb :search, :layout => :layout
  end

  get '/sell' do
    erb :sell, :layout => :layout
  end

  form_messages File.expand_path(File.join( File.dirname('sell.erb'),'config', 'errors.yaml'))
  post '/sell' do 
    form do
      field :title, :present => true
      field :price, :present => true, :int => true
      field :description, :present => true
      field :gender, :present => true
      field :age, :present => true
      field :temp, :present => true
      field :state, :present => true
      field :zip, :present => true, :length => 5
      field :email, :present => true, :email => true
    end

    if form.failed?
      output = erb :sell, :layout => :layout
      fill_in_form(output)
    else
      erb 'form passed' 
    end
  end
end
