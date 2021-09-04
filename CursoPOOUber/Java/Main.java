class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");
  
    Car car2 = new Car("QWE453",new Driver("Jaime Altozano", "ASF345", "ejemplo@email.com", "userPassword1", "Carnet Type C"));
    car2.passenger = 3;
    car2.printDataCar();
  }
}

// la clase debe tener el mismo nombre del archivo, public static sera la funcion que debemos pasar a la clase, y dentro podemos colocar el comportamiento 