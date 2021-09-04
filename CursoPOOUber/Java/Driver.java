class Driver extends Account{

  String license;

  public Driver(String name, String document, String email, String password, String license) {
    super(name, document, email, password);
    this.license = license;
  }
  
}