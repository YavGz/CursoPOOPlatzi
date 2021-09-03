class CreditCard extends Payment {
  construct(id, nameCard, cardNumber, dateCard, cvv){
    super(id)
    this.nameCard = nameCard;
    this.cardNumber = cardNumber;
    this.dateCard = dateCard;
    this.cvv = cvv;
  }
}