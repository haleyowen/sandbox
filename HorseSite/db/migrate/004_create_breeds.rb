migration 4, :create_breeds do
  up do
    create_table :breeds do
      column :id, Integer, :serial => true
      column :name, DataMapper::Property::String, :length => 255
    end
  end

  down do
    drop_table :breeds
  end
end
