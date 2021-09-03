from CursoPOOUber.Python.payment import Payment

class Paypal(Payment):
  email = str
  password = str
  def  __init__(self, id, email, password):
      super().__init__(id)
      self.email = email
      self.password = password