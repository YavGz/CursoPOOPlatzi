class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");

    Car car = new Car("AQM123", new Account("Pedrito Sola", "AND123"));
    car.passenger = 4;
    car.printDataCar();
  
    Car car2 = new Car("QWE453", new Account("Lolita ayala", "ANDA678"));
    car2.passenger = 3;
    car2.printDataCar();
  }
}

// la clase debe tener el mismo nombre del archivo, public static sera la funcion que debemos pasar a la clase, y dentro podemos colocar el comportamiento 