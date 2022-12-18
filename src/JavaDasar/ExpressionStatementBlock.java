package JavaDasar;

import java.util.Date;

public class ExpressionStatementBlock {

  public static void main(String[] args) {
    /*
     * Expression = konstruksi dr variabel, operator dan pemanggilan method yg mengevaluasi menjadi sebuah single value.
     * Expression => core component dr statement
     */
    int value; //expression
    value = 10; //expression

    System.out.println(value = 100); //statement => expression value = 100

    /*
     * Statement => kalimat lengkap dalam bahasa
     * Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma
     * Beberapa jenis statement:
     * 1. Assignment expression
     * 2. Penggunaan ++ dan --
     * 3. Method invocation
     * 4. Object creation expression
     */

    // 1. Assignment Statement
    double aValue = 8933.234;

    // 2. Increment Statement
    aValue++;

    // 3. Method Invocation Statement
    System.out.println("Hello World");

    // 4. Object Creation Statement
    Date date = new Date();

    /*
     * Block = kumpulan statement yg terdiri dari nol atau lebih statement
     * Block diawali dan diakhiri dengan kurung kurawal {}
     */
    {
      System.out.println("Hello World 1");
      System.out.println("Hello World 2");
    }
  }
}
