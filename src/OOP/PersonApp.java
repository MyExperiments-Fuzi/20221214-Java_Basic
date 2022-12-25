package OOP;

public class PersonApp {

  public static void main(String[] args) {
    var person1 = new Person("Fuad", "Surabaya");
    // person1.name = "Fuad";
    // person1.address = "Surabaya";
    // person1.country = "America";

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Budi");

    Person person2 = new Person("Budi");

    Person person3;
    person3 = new Person();
    person3.name = "Fuad";
    person3.address = "Surabaya";

    person3.sayHello("Budi"); // name belum dideklarasikan, maka nilainya null
  }
}
