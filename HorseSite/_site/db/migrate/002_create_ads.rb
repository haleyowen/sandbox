migration 2, :create_ads do
  up do
    create_table :ads do
      column :id, Integer, :serial => true
      column :title, String 
      column :name, String
      column :price, Integer
      column :description, String
      column :gender, String
      column :age, Integer
      column :color, Integer
      column :temp, Integer
      column :city, String
      column :state, String
      column :zip, String
      column :phone, String
      column :email, String
      column :address, String
    end
  end

  down do
    drop_table :ads
  end
end
