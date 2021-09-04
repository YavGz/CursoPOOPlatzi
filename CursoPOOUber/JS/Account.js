class Account {
  constructor(name, document, email, password) {
    this.id;
    this.name = name;
    this.document = document;
    this.email = email;
    this.password = password;
  }

  printDataUser(){
    console.log(
    `User: ${this.name}
    Document: ${this.document}
    Email: ${this.email}`);
  }

}

// function Account (name, document) {
//   this.id;
//   this.name = name;
//   this.document = document;
//   this.emaill;
//   this.password;
// }