class Car {
  Integer id;
  String license;
  Account driver;
  Integer passenger;

  public Car(String license, Account driver){
    this.license = license;
    this.driver = driver;
  }
  //  El driver como atributo lo cambiamos a tipo Account, ya que hereda de esa clase.
  //  El public Car() es nuestra funcion constructora y los parametros que se le pasen, son los requerimientos obligatorios.
  // luego tenemos que declarar las variables de la funcion con this, ya ue this hace referencia al objeto en el que sera declaraso, de lo contrario, sera un valor que se asigne a si mismo, dando un error.
  // This apuntunta a las variables del objeto, y no a las variables de la funcion constructora o del bloque donde se estén declarando

  void printDataCar() {
    System.out.println("License: " + license + " Driver: " + driver.name + " Correo: " + driver.email);
  }
}