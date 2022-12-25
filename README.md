# LEARN BASIC JAVA

## **3. Java Object Oriented Programming**

- **Pengenalan Object Oriented Programming**

  - **Object Oriented Programming (OOP)**

    - **OOP** = sudut pandang bahasa pemrograman yang berkonsep "objek".
    - Beberapa istilah OOP yg perlu dimengerti: **Object** dan **Class**.

      - **Object** = daya yg di dalamnya berisi field / properties / attributes dan method / function / behavior
      - Semua data bukan primitif di Java adalah object, dari mulai Integer, Boolean, Character, String dan yg lainnya.

      ***

      - **Class** = blueprint, prototype atau cetakan untuk membuat Object.
      - Class berisikan deklarasi semua properties dan functions yang dimiliki oleh Object.
      - Setiap Object selalu dibuat dari Class & sebuah Class bisa membuat Object tanpa batas.

      ***

- **Class**

  - untuk membuat class, kita bisa menggunakan kata kunci class.
  - Penamaan class biasa menggunakan format CamelCase.

    ```java
    // Class di Java
    class Person {

    }
    ```

- **Object**

  - Object = hasil instansiasi dari sebuah class.
  - Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan kurung ().

    ```java
    // Object di Java
    var person1 = new Person();
    Person person2 = new Person();

    Person person3;
    person3 = new Person();
    ```

- **Field**

  - Fields / Properties / Attributes = data yg bisa kita sisipkan di dalam Object.
  - Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa saja yg dimiliki object tersebut di dalam deklarasi class-nya.
  - Membuat field sama seperti membuat variable, namun ditempatkan di block class.

    ```java
    class Person {
      String name;
      String address;
      final String country = "Indonesia"; // tidak bisa dirubah variabelnya
    }
    ```

  - **Manipulasi Field**

    - Fields yg ada di object, bisa kita manipulasi. Tergantung final atau bukan.
    - Jika final, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah field nya.
    - Untuk memanipulasi data field, sama seperti cara pada variable.
    - Untuk mengakses field, kita butuh kata kunci . (titik) setelah nama object dan diikuti nama fields -nya.

    ```java
    var person = new Person();
    person.name = "Fuad Zein";
    person.address = "Surabaya";
    // person.country = "Tidak Bisa DIubah";

    System.out.println(person.name);
    System.out.println(person.address);
    System.out.println(person.country);
    ```

- **Method**

  - Selain menambahkan field, kita juga bisa menambahkan method ke object.
  - Caranya dengan mendeklarasikan method tersebut di dalam block class.
  - Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method yang ada di dalam block class.
  - Untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama method-nya, sama seperti mengakses field.

    ```java
    public class Person {
      String name;
      String address;
      final String country = "Indonesia";

      void sayHello(String paramName) {
      System.out.println("Hello " + paramName + ", My Name is " + name);
      }
    }
    ```

    ```java
    person.sayHello("Budi");
    ```

- **Constructor**

  - Constructor = method yg akan dipanggil saat pertama kali Object dibuat.
  - Mirip seperti di method, kita bisa memberi parameter pada constructor.
  - Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value.

    ```java
    class Person {
      String name;
      String address;
      final String country = "Indonesia";

      Person(String paramName, String paramAdress){
        name = paramName;
        address = paramAddress;
      }
    }
    ```

- **Constructor Overloading**

  - Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda.

    ```java
    class Person {
      String name;
      String address;
      final String country = "Indonesia";

      Person(String paramName, String paramAdress){
        name = paramName;
        address = paramAddress;
      }

      Person(String paramName){
        name = paramName;
      }

      Person(){

      }
    }
    ```

  - **Memanggil Constructor Lain**

    - Constructor bisa memanggil constructor lain.
    - Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan.
    - Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata kunci **this**.

    ```java
    class Person {
      String name;
      String address;
      final String country = "Indonesia";

      Person(String paramName, String paramAdress){
        name = paramName;
        address = paramAddress;
      }

      Person(String paramName){
        this(paramName, null);
      }

      Person(){
        this(null);
      }
    }
    ```

- **Variable Shadowing**

  - Variable shadowing = kejadian ketika kita membuat nama variable dengan nama yang sama di scope yang menutupi variable dengan nama yg sama di scope diatasnya.
  - Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class.
  - Saat terjadi variable shadowing, maka secara otomatis variable di scope di atasnya tidak bisa diakses.

    ```java
      class Person {
        String name;
        String address;
        final String country = "Indonesia";

        Person(String name, String address){
          name = name; // field nama tidak berubah
          address = address; // field address tidak berubah
        }

        void sayHello(String name){
          System.out.println("Hello" + name + ", My Name is " + name); // field name tidak diakses
        }

        void sayHello(){
          this.sayHello("Bos");
        }
      }
    ```

  - **note**: hati-hati menggunakan **variable shadowing**

- **This Keyword**

  - Saat kita membuat kode di dalam block constructor atau method di dalam class, kita bisa menggunakan kata kunci this untuk mengakses object saat ini.
  - Misal kadang kita butuh mengakses sebuah field yang namanya sama dengan parameter method, hal ini tidak bisa dilakukan jika langsung menyebut nama field, kita bisa mengakses nama field tersebut dengan kata kunci **this**.
  - This juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk mengakses method.
  - **This** bisa digunakan untuk mengatasi **masalah variable shadowing**.

    ```java
    class Person {
      String name;
      String address;
      final String country = "Indonesia";

      Person(String name, String address){
        this.name = name;
        this.address = address;
      }

      void sayHello(){
        this.sayHello("Bos");
      }

      void sayHello(String name){
        System.out.println("Hello" + name + ", My Name is " + this.name);
      }
    }
    ```

- **A**
- **A**
- **A**
- **A**
- **A**
- **A**
