from payment import Payment

class CreditCard(Payment):

  nameCard = str
  cardNumber = int
  dateCard = int
  cvv = int

  def __init__(self, id, nameCard, cardNumber, dateCard, cvv):
      super().__init__(id)
      self.nameCard = nameCard
      self.cardNumber = cardNumber
      self.dateCard = dateCard
      self.dateCard = dateCard
      self.cvv = cvv