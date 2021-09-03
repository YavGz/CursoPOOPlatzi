<?php

class CreditCard extends Payment {

  public $nameCard;
  public $cardNumber;
  public $dateCard;
  public $cvv;

  public function __construct($id, $nameCard, $cardNumber, $dateCard, $cvv){
    parent::__construct($id);
    $this->nameCard = $nameCard;
    $this->cardNumber = $cardNumber;
    $this->dateCard = $dateCard;
    $this->cvv = $cvv;
  }

}

?>