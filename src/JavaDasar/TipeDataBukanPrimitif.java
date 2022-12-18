package JavaDasar;

public class TipeDataBukanPrimitif {

  public static void main(String[] args) {
    // Tipe Data Primitif = tipe bawaan di dalam bahasa pemrograman, dan tidak bisa diubah lagi
    // Tipe data primitif = number, char, boolean (memiliki nilai default)
    Integer iniInteger = 100;
    Long iniLong = 10000L;

    Byte iniByte = null;
    System.out.println(iniByte);

    iniByte = 100;
    System.out.println(iniByte);

    // konversi primitif -> bukan primitif (secara kompitable)
    int iniInt = 200;
    Integer iniObject = iniInt;
    System.out.println(iniObject);

    // konversi bukan primitif -> primitif (secara tidak kompitable)
    short iniShort = iniObject.shortValue();
    long iniLong2 = iniObject.longValue();
    float iniFloat = iniObject.floatValue();
  }
}
