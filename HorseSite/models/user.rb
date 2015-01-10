require 'dm-sqlite-adapter'
class User
  include DataMapper::Resource
  
  property :id, Serial
  property :email, String, :required => true, :length => (5..40), :unique => true, :format => :email_address
  property :password, BCryptHash

end
    
