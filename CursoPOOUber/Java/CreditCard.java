class CreditCard extends Payment {
  String nameCard;
  Integer cardNumber;
  String dateCard;
  Integer cvv;

  public CreditCard(Integer id, String nameCard, Integer cardNumber, String dateCard, Integer cvv) {
    super(id);
    this.nameCard = nameCard;
    this.cardNumber = cardNumber;
    this.dateCard = dateCard;
    this.cvv = cvv; 
  }
}
