package JavaDasar;

public class IfStatement {

  public static void main(String[] args) {
    /*
     * # If Statement
     * If = salah satu kata kunci yang digunakan untuk percabangan.
     * Percabangan = kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
     */

    var nilai = 70;
    var absen = 90;

    if (nilai >= 75 && absen >= 75) {
      System.out.println("Selamat anda lulus...");
    } /*
     * # Else Statement
     * Block if akan dieksekusi ketika kondisi if bernilai true
     * Terkadang juga mau mengeluarkan jika kondisi if bernilai false
     */else {
      System.out.println("Silahkan coba lagi tahun depan...");
    }

    /*
     * # Else If Statement
     * kadang dalam if membutuhkan beberapa kondisi
     * Else if di java bisa lebih dari satu
     */

    var nilai2 = 70;
    var absen2 = 30;

    if (nilai2 >= 80 && absen2 >= 80) {
      System.out.println("Nilai Anda A");
    } else if (nilai2 >= 70 && absen2 >= 70) {
      System.out.println("Nilai Anda B");
    } else if (nilai2 >= 60 && absen2 >= 60) {
      System.out.println("Nilai Anda C");
    } else if (nilai2 >= 50 && absen2 >= 50) {
      System.out.println("Nilai Anda D");
    } else {
      System.out.println("Nilai Anda E");
    }
  }
}
