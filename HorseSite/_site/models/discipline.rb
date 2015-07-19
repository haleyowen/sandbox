class Discipline
  include DataMapper::Resource

  # property <name>, <type>
  property :id, Serial
  property :name, String
end
