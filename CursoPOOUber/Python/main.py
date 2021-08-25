from car import Car

if __name__ == "_main_":
  print("Hola Mundo")
  car = Car()
  car.license = "AQM123"
  car.driver = "Pedrito Sola"
  print(vars(car))

  car2 = Car ()
  car2.iicense = "QWE456"
  car2.driver = "Carmen Salinas"
  print(vars(car2))