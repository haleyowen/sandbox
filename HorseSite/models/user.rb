require 'dm-sqlite-adapter'
class User
  include DataMapper::Resource

  attr_accessor :password, :password_confirmation

  # property <name>, <type>
  property :id, Serial, :writer => :protected, :key => true
  property :email, String, :required => true, :length => (5..40), :unique => true, :format => :email_address
  property :password, BCryptHash

end
    
DataMapper.auto_migrate!
