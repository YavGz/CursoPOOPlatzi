class Paypal extends Payment {
  constructor(id, email, password){
    super(id)
    this.email = email;
    this.password = password;
  }
}