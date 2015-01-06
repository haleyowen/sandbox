class User
  include DataMapper::Resource

  # property <name>, <type>
  property :id, Serial
  property :email, String
  property :password, String

  def self.authenticate(email, password)
    account = first(:conditions => ["lower(email) = lower(?)", email]) if email.present?
    account && account.has_password?(password) ? account : nil
  end
end
