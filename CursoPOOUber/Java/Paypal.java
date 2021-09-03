class Paypal extends Payment {
  String email;
  String password;

  public Paypal(Integer id, String email, String password){
    super(id);
    this.email = email;
    this.password = password;
  }

}
