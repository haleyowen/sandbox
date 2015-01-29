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

  post '/search' do
    title = params['title']
    name = params['name']
    min_price = params['min-price']
    max_price = params['max-price']
    min_age = params['min-age']
    max_age = params['max-age']
    min_temp = params['min-temp']
    max_temp = params['max-temp']
    @ads = Ad.all

    @ads &= Ad.all(:title => title) if title.length != 0 
    @ads &= Ad.all(:name => name) if name.length != 0
    @ads &= Ad.all(:price.gte => min_price) if min_price.length != 0
    @ads &= Ad.all(:price.lte => max_price) if max_price.length != 0
    @ads &= Ad.all(:age.gte => min_age) if min_age.length != 0
    @ads &= Ad.all(:age.lte => max_age) if max_age.length != 0
    @ads &= Ad.all(:temp.gte => min_temp) if min_temp.length != 0
    @ads &= Ad.all(:temp.lte => max_temp) if max_temp.length != 0
    erb :adslist, :layout => :layout
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

  get '/adslist' do
    @ads = Ad.all
    erb :adslist, :layout => :layout
  end

end
