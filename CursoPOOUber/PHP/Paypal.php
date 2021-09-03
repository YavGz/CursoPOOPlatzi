<?php

class Paypal extends Payment {

  public $email;
  public $password;

  public function __construct($id, $email, $password){
    parent::__construct($id);
    $this->email = $email;
    $this->password = $password;
  }

}

?>