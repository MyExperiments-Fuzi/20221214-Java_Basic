package JavaDasar;

public class BreakContinue {

  public static void main(String[] args) {
    /*
     * Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
     * Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan
     * Namun berbeda dengan continue, continue = digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya.
     */

    // Kode: Break
    var counter = 1;

    while (true) {
      System.out.println("Perulanga ke " + counter);
      counter++;

      if (counter > 10) {
        break;
      }
    }
    System.out.println("Perulangan berhenti");
    System.out.println();

    // Kode: Continue
    for (var count = 1; count <= 50; count++) {
      if (count % 2 == 0) {
        continue;
      }

      System.out.println("Perulangan Ganjil " + count);
    }
  }
}
