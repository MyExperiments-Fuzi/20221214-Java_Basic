package JavaDasar;

public class TernaryOperator {

  public static void main(String[] args) {
    /*
     * Ternary Operator = operator sederhana dr if statement
     * Terdiri dr kondisi yg dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil.
     */

    // menggunakan if else (tanpa ternary operator)
    var nilai = 75;
    String ucapan;

    if (nilai >= 75) {
      ucapan = "Selamat anda lulus";
    } else {
      ucapan = "Silahkan coba lagi";
    }
    System.out.println(ucapan);
    System.out.println();

    // menggunakan ternary operator
    var nilai2 = 30;
    String ucapan2 = nilai2 >= 75 ? "Selamat anda lulus" : "Silahkan coba lagi";
    System.out.println(ucapan2);
  }
}
