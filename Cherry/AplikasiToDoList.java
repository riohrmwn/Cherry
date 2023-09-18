import java.util.Scanner;

public class AplikasiToDoList {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        ViewShowToDoList();

    }

    // Menampilkan To Do List
    public static void ShowToDoList() {
        for (var i = 0; i < model.length; i++) {
            String ToDo = model[i];
            int no = i + 1;

            if (ToDo != null) {
                System.out.println(no + ". " + ToDo);
            }
        }
    }

    /**
     * 
     */
    public static void TestShowToDoList() {
        model[0] = "Tugas Jarkomdat";
        model[1] = "Tugas Bahasa Inggris";
        model[2] = "Tugas Pemweb II";
        ShowToDoList();

    }

    // Menambah To Do List
    public static void AddToDoList(String todo) {
        // cek apakah model penuh ?
        var isfull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // model masih ada yang kosong
                isfull = false;
                break;
            }
        }

        // jika penuh , kita resixe ukuran array 2x lipat
        if (isfull) {
            var temp = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data arraynya NULL
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }

    }

    public static void TestAddToDoList() {
        for (int i = 0; i < 25; i++) {
            AddToDoList("Contoh Todo ke." + i);
        }

        ShowToDoList();
    }

    // Menghapus To Do List
    public static boolean RemoveToDoList(Integer number) {
        if (number < 1 || number > model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = number - 1; i < model.length - 1; i++) {
                model[i] = model[i + 1];
            }
            model[model.length - 1] = null;
            return true;
        }

    }

    public static void testRemoveTodoList() {
        AddToDoList("satu");
        AddToDoList("dua");
        AddToDoList("tiga");
        AddToDoList("empat");
        AddToDoList("lima");

        var result = RemoveToDoList(3);
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

    public static void testinput() {
        var name = input("name");
        System.out.println("Hi" + name);

        var channel = input("channel");
        System.out.println(channel);
    }

    // Menampilkan View ToDo List
    public static void ViewShowToDoList() {

        while (true) {
            ShowToDoList();
            System.out.println("MENU");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            System.out.println("Pilih: ");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                ViewAddToDoList();
            } else if (input.equals("2")) {
                ViewRemoveToDoList();
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }

    }

    public static void testViewShowToDoList() {
        AddToDoList("Satu");
        AddToDoList("Dua");
        AddToDoList("Tiga");
        AddToDoList("Empat");
        AddToDoList("Lima");
        ViewShowToDoList();
    }

    // Menampilkan View menambah To Do List
    public static void ViewAddToDoList() {
        String ToDo = input("Masukan To Do baru");
        AddToDoList(ToDo);
    }

    // Menampilkan View menghapus To Do List
    public static void ViewRemoveToDoList() {
        var number = Integer.parseInt(input("Nomor To Do List yang akan anda hapus"));
        var result = RemoveToDoList(number);
        if (!result) {
            System.out.println("Todo tidak ditemukan atau tidak dapat di hapus");
        }
    }
}
