// function Car (driver, license) {
//   this.id;
//   this.license = license;
//   this.driver = driver; 
//   this.passenger;
// }

// Car.prototype.printDataCar = function () {
//   console.log(driver);
//   console.log(driver.name);
//   console.log(driver.document);
// }

// clases de ecmascript6+ 2015

class Car {
  constructor(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
  }
  printDataCar = () => {
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
  }
}