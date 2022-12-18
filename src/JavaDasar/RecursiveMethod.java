package JavaDasar;

public class RecursiveMethod {

  public static void main(String[] args) {
    /*
     * Recursive Method = kemampuan method memanggil method dirinya sendiri.
     * Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial.
     * Factorial = jika kita memberikan nilai 5, maka dia akan mengkalikan angka sebelumnya: 5*4, 5*3, 5*2, 5*1
     */

    // Kode: Fatorial Loop (Menggunakan Perulangan Biasa)
    System.out.println(factorialLoop(5));
    System.out.println(1 * 2 * 3 * 4 * 5); // cek perbandiang apakah benar untuk factorial hasilnya
    System.out.println();

    // Factorial Recursive (Memanggil method dia sendiri)
    System.out.println(factorialRecrusive(5));
    System.out.println();

    /*
     * # Problem Dengan Recursive
     * Menarik, namun perlu hati-hati
     * Jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error StackOverflow = dimana stack method terlalu banyak di Java
     * Kenapa problem ini bisa terjadi?
     * Karena ketika ia memanggil method, Java akan menyimpannya dalam stack,
     * jika method tersebut memanggil method lain, maka stack akan menupuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow.
     */
    // Kode: Error StackOverflow
    loop(10); // masih aman
    // loop(10000); // StackOverflow
  }

  // Kode: Fatorial Loop (Menggunakan Perulangan Biasa)
  static int factorialLoop(int value) {
    var result = 1;
    for (var counter = 1; counter <= value; counter++) {
      result *= counter;
    }
    return result;
  }

  // Kode: Factorial Recursive (Memanggil method dia sendiri)
  static int factorialRecrusive(int value) {
    if (value == 1) {
      return 1;
    } else {
      return value * factorialRecrusive(value - 1);
    }
  }

  // Kode: Error StackOverflow
  static void loop(int value) {
    if (value == 0) {
      System.out.println("Selesai");
    } else {
      System.out.println("Loop ke " + value);
      loop(value - 1);
    }
  }
}
