package JavaDasar;

public class MethodVariableArgument {

  public static void main(String[] args) {
    /*
     * Kadang kita butuh mengirim data ke method sejumlah data yg tidak pasti
     * Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
     * Namun di Java, kita bisa menggunakan variabel argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
     * Parameter dengan tipe variabel argument, hanya bisa ditempatkan di posisi akhir parameter
     */

    // Kode: Tanpa Variabel Argument
    int[] values = { 80, 50, 50, 50, 80 };
    sayCongrate("Fuad", values); // data array values = tidak bisa dimasukkan secara langsung
    System.out.println();

    // Dengan Variable Argumnet
    sayCongrate2("Budi", 80, 90, 70, 80);
  }

  // Kode: Tanpa Variabel Argument
  static void sayCongrate(String name, int[] values) {
    var total = 0;
    for (var value : values) {
      total += value;
    }

    var finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", anda lulus...");
    } else {
      System.out.println("Maaf " + name + ", anda belum lulus...");
    }
  }

  // Dengan Variable Argumnet
  static void sayCongrate2(String name, int... values) {
    var total = 0;
    for (var value : values) {
      total += value;
    }

    var finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", anda lulus...");
    } else {
      System.out.println("Maaf " + name + ", anda belum lulus...");
    }
  }
}
