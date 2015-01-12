migration 2, :create_ads do
  up do
    create_table :ads do
      column :id, Integer, :serial => true
      
    end
  end

  down do
    drop_table :ads
  end
end
