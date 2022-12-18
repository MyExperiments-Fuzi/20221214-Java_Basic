package JavaDasar;

public class ForEach {

  public static void main(String[] args) {
    /*
     * Kadang kita biasa mengakses data array menggunakan perulangan.
     * Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses arrat menggunakan counter yg kita buat.
     * Namun untungnya, di Java terdapat perulangan for each = bisa digunakan untuk mengakses seluruh data di Array secara otomatis.
     */

    // Kode: Tanpa For Each
    String[] names = { "Fuad", "Zein", "Selalu", "Semangat" };

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    System.out.println();

    // For Each => java 5 / 6
    for (String name : names) {
      System.out.println(name);
    }
  }
}
