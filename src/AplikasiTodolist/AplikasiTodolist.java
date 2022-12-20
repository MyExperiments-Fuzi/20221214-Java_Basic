package AplikasiTodolist;

public class AplikasiTodolist {

  public static String[] model = new String[10];

  public static void main(String[] args) {
    // testShowTodoList();
    // testAddTodoList();
    testRemoveTodoList();
  }

  /**
   * Menampilkan todo list
   */
  public static void showTodoList() {
    for (int i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo);
      }
    }
  }

  public static void testShowTodoList() {
    model[0] = "Belajar Java Dasar";
    model[1] = "Studi Kasus Java Dasar : Aplikasi TodoList";
    showTodoList();
  }

  /**
   * Menambahkan todo ke list
   */
  public static void addTodoList(String todo) {
    // cek apakah model penuh?
    var isFull = true;
    for (int i = 0; i < model.length; i++) {
      if (model[i] == null) {
        // model masih ada yg kosong
        isFull = false;
        break;
      }
    }

    // jika penuh, kita resize ukuran array 2x lipat
    if (isFull) {
      var temp = model; // untuk menampung data lama, agar tidak hilang
      model = new String[model.length * 2];

      for (int i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }

    // tambahkan ke posisi yg data arraynya null
    for (int i = 0; i < model.length; i++) {
      if (model[i] == null) {
        model[i] = todo;
        break;
      }
    }
  }

  public static void testAddTodoList() {
    for (int i = 1; i <= 25; i++) {
      addTodoList("Contoh Todo ke - " + i);
    }

    showTodoList();
  }

  /**
   * Menghapus todo dari list
   */
  public static boolean removeTodoList(Integer number) {
    if ((number - 1) >= model.length) { // jika panjang lebih
      return false;
    } else if (model[number - 1] == null) { // jika value null
      return false;
    } else {
      // satu
      // tiga -> tergeser karena dua dihapus
      // null

      for (int i = (number - 1); i < model.length; i++) {
        if (i == (model.length - 1)) { // menghindari out of the bound
          model[i] = null;
        } else {
          model[i] = model[i + 1];
        }
      }
      return true;
    }
  }

  public static void testRemoveTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    addTodoList("Empat");
    addTodoList("Lima");

    var result = removeTodoList(20);
    System.out.println(result);

    result = removeTodoList(7);
    System.out.println(result);

    result = removeTodoList(2);
    System.out.println(result);

    showTodoList();
  }

  /**
   * Menampilkan view todo list
   */
  public static void viewShowTodoList() {}

  /**
   * Menampilkan view tambah todo list
   */
  public static void viewAddTodoList() {}

  /**
   * Menampilkan view hapus todo list
   */
  public static void viewRemoveTodoList() {}
}
