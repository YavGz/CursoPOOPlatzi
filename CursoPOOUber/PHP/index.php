<?php

require_once("./Account.php");
require_once("./Car.php");

$car = new Car("AWD123", new Account("Pedrito Sola","Driver Permission tipe C"));
$car->printDataCar();