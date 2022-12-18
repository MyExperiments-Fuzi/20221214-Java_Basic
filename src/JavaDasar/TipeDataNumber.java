package JavaDasar;

public class TipeDataNumber {

  public static void main(String[] args) {
    // Default value number = 0

    // Integer Number
    byte iniByte = 100;
    short iniShort = 1000;
    int iniInt = 10000000;
    long iniLong = 1000000000;
    long iniLong2 = 10000000000L;

    // Floating Point Number
    float iniFloat = 19.10F;
    double iniDouble = 10.10;

    // kode: Literals
    int decimalInt = 25;
    int hexDecimal = 0xFFFFF; //awal 0x
    int binaryDecimal = 0b101010; //awal 0b

    // kode: Underscore -> semenjak jdk 7 / 8 (mempermudah membaca angka, tidak ada value)
    long amount = 1_000_000_000;

    // Konversi Tipe Data Number
    // 1. Widening Casting (Otomatis): byte->short->int->long->float->double
    byte konversiByte = 10;
    short konversiShort = konversiByte;
    int konversiInt = konversiShort;
    long konversiLong = konversiInt;
    float konversiFloat = konversiLong;
    double konversiDouble = konversiFloat;
    // 2. Narrowing Casting(Manual): double->float->long->int->char->short->byte
    // int konversiInt2 = 1000;
    // byte konversiByte2 = (byte) konversiByte;
    // Number Overflow = saat konversi melebihi batas maksimal, dan dibaca secara berulang
    float konversiFloat2 = (float) konversiDouble;
    long konversiLong2 = (long) konversiFloat2;
    int konversiInt2 = (int) konversiLong2;
    short konversiShort2 = (short) konversiInt2;
  }
}
