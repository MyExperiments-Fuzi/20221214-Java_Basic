package JavaDasar;

public class DoWhileLoop {

  public static void main(String[] args) {
    /*
     * Do While Loop = perulangan yg mirip dengan while
     * Perbedaannya hanya pada pengecekan kondisi.
     * Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan,
     * sedangkan di do while loop dilakukan setelah perulangan dilakukan.
     * Oleh karena itu dalam Do While Loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true
     */

    // Menggunakan while
    var counter = 100;
    while (counter <= 10) {
      System.out.println("Perulangan ke " + counter); // data tidak ada
      counter++;
    }
    System.out.println();

    // Menggunakan Do While
    do {
      System.out.println("Do While ke " + counter); // ditampilkan sekali terlbih dahulu, contoh: menu program
      counter++;
    } while (counter <= 10);
  }
}
