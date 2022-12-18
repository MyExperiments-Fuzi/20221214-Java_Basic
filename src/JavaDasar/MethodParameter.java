package JavaDasar;

public class MethodParameter {

  public static void main(String[] args) {
    /*
     * Kita bisa mengirim informasi ke method yg ingin kita panggil
     * Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yg sudah kita buat.
     * Cara membuat parameter sama seperti cara membuat variabel
     * Parameter ditempatkan di dalam kurung () di deklarasi method
     * Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
     */

    sayHello("Fuad", "Zein");
    sayHello("Budi", "Doremi");
  }

  static void sayHello(String firstName, String lastName) {
    System.out.println("Hello " + firstName + " " + lastName);
  }
}
