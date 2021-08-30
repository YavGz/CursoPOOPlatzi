from car import Car
from  account import Account

if __name__ == "_main_":
  print("Hola Mundo")
  
  car = Car ("ASD123", Account("Pedrito Sola","WASD12"))
  print(vars(car))
  print(vars(car.driver))

  # car2 = Car ()
  # car2.iicense = "QWE456"
  # car2.driver = "Carmen Salinas"
  # print(vars(car2))