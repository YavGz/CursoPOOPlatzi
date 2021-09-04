class Driver extends Account{
  constructor(name, document, email, password, license){
    super(name, document, email, password);
    this.license = license;
  }
}