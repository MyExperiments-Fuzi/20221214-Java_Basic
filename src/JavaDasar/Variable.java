package JavaDasar;

public class Variable {

  public static void main(String[] args) {
    // Variable = tempat untuk menyimpan data;

    String name;
    name = "Fuad Zein";

    int age = 20;
    String address = "Indonesia";

    System.out.println(name);
    System.out.println(age);
    System.out.println(address);

    name = "Budi Doremi";
    System.out.println(name); //bisa merubah value, akan tetapi tidak bisa merubah tipe datanya

    // Var = sejak java 10, sehingga tidak perlu menyebutkan tipe datanya
    // Note = saat menggunakan kata kunci var untuk membuat variable, harus menginisiasi value / nilai dari variable tersebut secara langsung
    // var name; // error
    // name = "Fuad Zein"
    var firstName = "Fuad";
    var lastName = "Zein";

    System.out.println(firstName);
    System.out.println(lastName);

    // Kata kunci Final(Konstan) = data tidak bisa dirubah setelah dibuat
    final String application = "Belajar Java";
    // application = "Belajar JavaScript" // tidak bisa dirubah value-nya
    System.out.println(application);
  }
}
