public class aplikasiTodoList {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);



    public static void main(String[] args) {
        viewShowTodoList();
    }



    /**
     * Menampilkan Todo List
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;


            if (todo != null){
                System.out.println(no +". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar";
        showTodoList();
    }

    /**
     * Menambah Todo ke List
     */
    public static void addTodoList(String todo){
        // cek apakah model penuh?
        var penuh = true;
        for (int i = 0; i < model.length; i++) {
           if(model[i] == null){
               // model masih ada yang kosong
               penuh = false;
               break;
           }
        }

        // jika penuh, kita resize ukuran array 2x lipat
        if(penuh){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

       // Tambahkan ke posisi yang data array nya Null
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++) {
            addTodoList("contoh todo ke." + i);
        }

        showTodoList();
    }

    /**
     * Menghampus Todo dari list
     */
    public static boolean removeTodoList(int number){
        if ((number -1) >= model.length){
            return false;
        } else if(model[number - 1] == null) {
            return false;
        }  else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1) ) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
                }
            
            return true;
        }
    }

    public static void testRemoveTodoList(){
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

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi " + name);
    }


    /**
     * Menampilkan view Todo Liist
     */
    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("MENU");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan Tidak Di Mengerti");
            }
        }
    }
       public static void testViewShowTodoList(){
           addTodoList("Satu");
           addTodoList("Dua");
           addTodoList("Tiga");
           addTodoList("Empat");
           addTodoList("Lima");
           viewShowTodoList();
        }



    /**
     * Menampilkan view Menambahkan Todo List
     */
    public static void viewAddTodoList(){
        System.out.println("MENAMBAHKAN TODOLIST");

        var todo = input("Todo (x Jika Batal)");
                if(todo.equals("x")){
                    // Batal
                } else {
                    addTodoList(todo);
                }
    }

    public static void testViewTodoList(){
        viewAddTodoList();

        showTodoList();
    }

    /**
     * Menampilkan view menghapud Todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("Menghapus TodoList");
        var number = input("Nomor yang dihapus (x Jika Batal)");

        if(number.equals("x")){
            // Batal
        } else {
         boolean success = removeTodoList(Integer.valueOf(number));
         if (!success){
             System.out.println("Gagal menghapus Todolist : " + number);

         }
        }
    }
    public static void testViewRemoveTodoList(){
         addTodoList("satu");
         addTodoList("Dua");
         addTodoList("Tiga");

         showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
