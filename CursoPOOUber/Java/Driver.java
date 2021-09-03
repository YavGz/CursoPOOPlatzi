class Driver extends Account{

  String license;

  public Driver(Integer id, String name, String document, String email, String password, String license) {
    super(id, name, document, email, password);
    this.license = license;
  }
  
}