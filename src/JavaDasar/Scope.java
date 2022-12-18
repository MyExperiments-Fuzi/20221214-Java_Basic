package JavaDasar;

public class Scope {

  public static void main(String[] args) {
    /*
     * Di Java, variabel hanya bisa diakses di dalam area dimana mereka dibuat.
     * Hal ini di sebut scope.
     * Contoh, jika sebuah variabel dibuat di method, maka hanya bisa diakses di method tersebut, atau jika dibuat di dalam block, maka hanya bisa diakses di dalam block tersebut.
     */

    // Kode: Scope
    sayHello("Fuad");
  }

  // Kode: Scope
  static void sayHello(String name) {
    String hello = "Hello " + name;
    if (!name.isBlank()) {
      String hi = "Hi " + name;
      System.out.println(hi);
    }

    System.out.println(hello);
    // System.out.println(hi); // error, karena di luar scope
  }
}
