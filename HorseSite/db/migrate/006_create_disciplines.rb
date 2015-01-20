migration 6, :create_disciplines do
  up do
    create_table :disciplines do
      column :id, Integer, :serial => true
      column :name, DataMapper::Property::String, :length => 255
    end
  end

  down do
    drop_table :disciplines
  end
end
