package JavaDasar;

public class TipeDataArray {

  public static void main(String[] args) {
    // Membuat Array secara satuan
    String[] arrayString;
    arrayString = new String[2];
    arrayString[0] = "Fuad";
    arrayString[1] = "Zein";

    System.out.println(arrayString[0]);
    System.out.println(arrayString[1]);

    arrayString[0] = "Budi"; // mengubah value array
    System.out.println(arrayString[0]);

    // Membuat Array secara langsung
    String[] arrayString2 = new String[2];

    // kode: Array Initializer
    // cara 1
    int[] arrayInt = new int[] { 10, 90, 80, 67, 29 };
    // cara 2
    long[] arrayLong = { 10L, 90L, 80L, 67L, 29L };
    String[] namaName = { "Fuad", "Zein" };

    arrayLong[0] = 0;

    System.out.println(arrayLong.length);
    System.out.println(arrayLong[0]);

    // kode: Array di dalam Array
    String[][] members = {
      { "Fuad", "Zein" },
      { "Budi", "Doremi" },
      { "Doni" },
    };

    System.out.println(members[0][1]);
    System.out.println(members[1][0]);
  }
}
