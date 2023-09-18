public class AplikasiToDoList {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        testinput();

    }

    // Menampilkan To Do List
    public static void ShowToDoList() {
        for (var i = 0; i < model.length; i++) {
            var ToDo = model[i];
            var no = i + 1;

            if (ToDo != null) {
                System.out.println(no + ". " + ToDo);
            }
        }
    }

    public static void TestShowToDoList() {
        model[0] = "Tugas Jarkomdat";
        model[1] = "Tugas Bahasa Inggris";
        model[2] = "Tugas Pemweb II";
        ShowToDoList();
        ;

    }

    // Menambah To Do List
    public static void AddToDoList(String todo) {
        // cek apakah model penuh ?
        var penuh = true;
        for (int i = 0; i < model.length(); i++) {
            if (model[i] == null){
                //model masih ada yang kosong
                penuh = false;
                break;
            }
        }

        // jika penuh , kita resixe ukuran array 2x lipat
        is (isFull) {
            var temp : String[model.length * 2];

            for (int i =0 ; i < temp.length ; i++) {
                model[i] = temp[i];
            }
        }
        // tambahkan ke posisi yang data arraynya NULL
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] == todo;
                break;
            }
        }

    }

    public static void TestShowToDoList() {
        for (int i = 0; i < 25; i++) {
            AddToDoList("Contoh Todo ke." + i);
        }

        ShowToDoList();
    }

    // Menghapus To Do List
    public static void RemoveToDoList(Integer number) {
        if ((number - 1) >= (model.length) {
            return false;
        } else if (model[number-1] == null) {
            return false;
        } else {
            model[number-1] = null;
            return ;
        }

    }

    public static void testRemoveTodoList() {
        AddToDoList("satu");
        AddToDoList("dua");
        AddToDoList("tiga");
        AddToDoList("empat");
        AddToDoList("lima");

        var result = RemoveToDoList(20);
        System.out.println(result);

        result = RemoveToDoList(7);
        System.out.println(result);

        result = RemoveToDoList(2);
        System.out.println(result);

        ShowToDoList();
    }

    public static String input(String info) {
        System.out.println(info + ": ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testinput(){
        var name = input("name");
        System.out.println("Hi" + name);

        var channel =  input("channel");
        System.out.println("channel);
    }

    // Menampilkan View ToDo List
    public static void ViewShowToDoList() {

    }

    // Menampilakn View menambah To Do List
    public static void ViewAddToDoList() {

    }

    // Menampilkan View menghapus To Do List
    public static void ViewRemoveToDoList() {

    }
