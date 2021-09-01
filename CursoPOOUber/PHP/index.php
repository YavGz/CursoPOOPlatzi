<?php
require_once("./Car.php");
require_once("./uberX.php");
require_once("./UberPool.php");
require_once("./Account.php");

$uberX = new UberX("ASE124", new Account("Pedrito Sola", "Carnet type C"), "Chevrolet", "Spark");
$uberX ->printDataCar();

$uberPool = new UberPool("ASE124", new Account("Lolita Ayala", "Carnet type C"), "Dodge", "Attitude");
$uberPool ->printDataCar();

?>