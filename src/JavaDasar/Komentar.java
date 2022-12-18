package JavaDasar;

public class Komentar {

  public static void main(String[] args) {
    /*
     * Komentar = kode program yang akan dihiraukan saat proses kompilasi, sehingga di binary code Java, tidak akan ada kode komentar tersebut.
     * Biasanya komentar digunakan untuk dokumentasi.
     * Jenis komentar di Java ada 2: multiline & singleline
     */

    System.out.println(sum(10, 10));
  }

  /**
   * Java Doc / Java Documentation
   * Method untuk menjumlahkan value1 dan value2
   * @param value1 angka pertama
   * @param value2 angka kedua
   * @return hasil penjumlahan value1 dan value2
   */
  static int sum(int value1, int value2) {
    // Jumlahkan value1 ditambah value2
    return value1 + value2;
  }
}
