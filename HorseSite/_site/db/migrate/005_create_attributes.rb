migration 5, :create_attributes do
  up do
    create_table :attributes do
      column :id, Integer, :serial => true
      column :name, DataMapper::Property::String, :length => 255
    end
  end

  down do
    drop_table :attributes
  end
end
