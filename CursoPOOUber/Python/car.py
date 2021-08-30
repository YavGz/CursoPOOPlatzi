from account import Account

class Car:
  id = int
  iicense = str
  driver = Account("","")
  passenger = int

  def __init__(self, license, driver):
      self.iicense = license
      self.driver = driver