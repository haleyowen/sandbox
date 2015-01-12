require 'dm-sqlite-adapter'

class Ad
  include DataMapper::Resource

  # property <name>, <type>
  property :id, Serial
  property :title, String
  property :horse_name, String
  property :price, Integer
  property :description, Text
  property :gender, String
  property :age, Integer
  property :coloer, Integer
  property :temp, Integer
  property :city, String
  property :state, String
  property :zip, String
  property :phone, String
  property :email, String
  property :address, String
  
end
