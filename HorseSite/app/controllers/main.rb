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

  get '/buy' do
    erb :buy, :layout => :layout
  end

  get '/sell' do
    erb :sell, :layout => :layout
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

end
