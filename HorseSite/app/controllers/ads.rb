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

  post '/sell' do
    form do
      filters :strip
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
      @ad = Ad.new(title: params['title'].to_s,
                   name: params['name'].to_s,
                   price: params['price'].to_i,
                   description: params['description'].to_s,
                   gender: params['gender'].to_s,
                   age: params['age'].to_i,
                   color: params['color'].to_i,
                   temp: params['temp'].to_i,
                   city: params['city'].to_s,
                   state: params['state'].to_s,
                   zip: params['zip'].to_s,
                   phone: params['phone'].to_s,
                   email: params['email'].to_s,
                   address: params['address'].to_s)
      
      if @ad.save
        erb "YES"
      else
        puts(@ad.errors)
        @ad.title
      end
    end
  end
end
