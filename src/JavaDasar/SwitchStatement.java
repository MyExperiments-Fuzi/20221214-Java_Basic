package JavaDasar;

public class SwitchStatement {

  public static void main(String[] args) {
    /*
     * Switch = statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
     * Kondisi di switch statement hanya untuk perbandingan ==
     */
    var nilai = "R";

    switch (nilai) {
      case "A":
        System.out.println("Wow, Anda Lulus Dengan Baik...");
        break;
      case "B":
      case "C":
        System.out.println("Nilai Anda Cukup Baik...");
        break;
      case "D":
        System.out.println("Anda Tidak Lulus...");
        break;
      default:
        System.out.println("Mungkin Anda Salah Jurusan...");
        break;
    }

    /*
     * # Switch Lambda = di Java 14
     * Mempermudah saat penggunaan switch expression, karena kita tidak perlu lagi menggunakan kata kunci break
     */
    // var nilai2 = "A";
    // switch (nilai2) {
    //   case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
    //   case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
    //   case "D" -> System.out.println("Anda tidak lulus");
    //   default -> {
    //     System.out.println("Mungkin anda salah jurusan");
    //   }
    // }
    System.out.println();

    /*
     * Kata kunci Yield = di Java 14
     * Yield = dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement.
     * Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement.
     */
    // Cara 1:
    var nilai2 = "A";
    String ucapan;
    switch (nilai2) {
      case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
      case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
      case "D" -> ucapan = "Anda tidak lulus";
      default -> {
        ucapan = "Mungkin anda salah jurusan";
      }
    }
    System.out.println(ucapan);
    System.out.println();

    // Cara 2:
    var nilai3 = "R";
    String ucapan1 =
      switch (nilai3) {
        case "A":
          yield "Wow, Anda Lulus Dengan Baik...";
        case "B", "C":
          yield "Nilai Anda Cukup Baik...";
        case "D":
          yield "Anda Tidak Lulus...";
        default:
          yield "Mungkin Anda Salah Jurusan...";
      };
    System.out.println(ucapan1);
    System.out.println();
  }
}
