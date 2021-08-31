class UberX extends Car {
  String brand;
  String model;

  public UberX(String license, Account driver, String brand, String model) {
    super(license, driver);
    this.brand = brand;
    this.model = model;
  }
}

// Cuando aplicamos la herencia, tenemos que crear una nueva clase (clase hija) que extienda de una clase existente (clase padre)
//  al crear un metodo contructor de esta clase hija, podemos llamar directamente al constrcutor de la clase padre, haremos referencia a esta con la palabra reservada "super".
// De esta manera hacemos referencia a la clase padre o super clase con "super", y a la clase hija en la que estamos trbajando con "this" 