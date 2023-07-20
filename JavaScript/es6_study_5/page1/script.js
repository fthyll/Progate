// Pindahkan pendefinisian class Animal ke animal.js dan hapus code di bawah
/*class Animal {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  greet() {
    console.log("Halo");
  }

  info() {
    this.greet();
    console.log(`Nama saya adalah ${this.name}`);
    console.log(`Saya berusia ${this.age} tahun`);
  }
}
*/
// Pindahkan pendefinisian class Dog ke dog.js dan hapus code di bawah
/*
class Dog extends Animal {
  constructor(name, age, breed) {
    super(name, age);
    this.breed = breed;
  }
  
  info() {
    this.greet();
    console.log(`Nama saya adalah ${this.name}`);
    console.log(`Saya adalah seekor ${this.breed}`);
    
    console.log(`Saya berusia ${this.age} tahun`);
    const humanAge = this.getHumanAge();
    console.log(`Saya berusia ${humanAge} tahun dalam umur manusia`);
  }
  
  getHumanAge() {
    return this.age * 7;
  }
}
*/
// Code di bawah jangan diganggu karena bukan bagian dari class Animal ataupun Dog
const dog = new Dog("Leo", 4, "Chihuahua");
dog.info();
