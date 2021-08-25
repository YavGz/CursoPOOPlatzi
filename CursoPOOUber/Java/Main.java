class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");

    Car car = new Car();
    car.license = "AQM123";
    car.driver = "Pedrito Sola";
    car.passenger = 4;
    car.printDataCar();
  
    Car car2 = new Car();
    car2.license = "QWE453";
    car2.driver = "Lolita Ayala";
    car2.passenger = 3;
    car2.printDataCar();
  }
}

// la clase debe tener el mismo nombre del archivo, public static sera la funcion que debemos pasar a la clase, y dentro podemos colocar el comportamiento 