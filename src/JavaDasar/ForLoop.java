package JavaDasar;

public class ForLoop {

  public static void main(String[] args) {
    /*
     * For = salah satu kunci yg bisa digunakan untuk melakukan perulangan.
     * Blok kode yg terdapat di dalam for akan selalu diulang selama kondisi for terpenuhi.
     */

    // Sintak Perulangan For
    /*
     * for(init statement; kondisi; post statement){
     *  blok perulangan
     * }
     *
     * init statement = akan dieksekusi hanya sekali di awal sebelum perulangan
     * kondisi = akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti
     * post statement = akan dieksekusi setiap kali diakhir perulangan
     * init statement, kondisi dan post statement tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi selalu bernilai true
     */

    // // Perulangan Tanpa Henti
    // for (;;) {
    //   System.out.println("Perulangan tanpa henti");
    // }

    // Perulangan Dengan Kondisi
    var counter = 1;
    for (; counter <= 10;) {
      System.out.println("Perulangan ke " + counter);
      counter++;
    }
    System.out.println(counter);

    // Perulangan Dengan Init Statement
    for (var count = 1; count <= 10;) {
      System.out.println("Ini ke " + count);
      count++;
    }

    // Perulangan Dengan Post Statement
    for (var i = 0; i <= 10; i++) {
      System.out.println("i ke " + i);
    }
  }
}
