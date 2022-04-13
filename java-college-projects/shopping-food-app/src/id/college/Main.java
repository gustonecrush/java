package id.college;
import id.makanan.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instansiasi Object Scanner
        Scanner inputPembeli = new Scanner(System.in);

        // Store data array makanan ke dalam variable Menu
        String Menu[][][] = dataStoreMakanan();

        // Memanggil fungsi menu
        menu(inputPembeli, Menu);

    }

    public static String[][][] dataStoreMakanan() {
        /*
         * dataStoreMakanan()
         * I : -
         * O : Mengembalikan nilai array object 3 dimensi yang berisi data-data
         *     makanan, frozen food, serta fresh food yang akan diinstansiasi
         *     saat pembuatan object Makanan, FrozenFood, maupun FreshFood
         * Nb: Karena ini masih sederhana, agar tidak menimbulkan error maka kalau ingin menambahkan data
         *     harus ditambahain semua. Contoh kalian mau nambahin satu data di array Makanan
         *     maka kalian harus menambahkan satu data juga baik di array Frozen Food maupun di Fresh Food
         * */

        String[][] Makanan = {
                {"Siomay", "25000"},
                {"Steak Beef", "30000"},
                {"Ramen", "15000"}
        };

        String[][] FrozenFood = {
                {"Chicken Teriyaki", "85000", "3.14"},
                {"Bluberry Frozen", "65000", "1.25"},
                {"Nugget Kenzler", "50000", "2"}
        };

        String[][] FreshFood = {
                {"Paket Buah Segar", "100000", "Buah", "15"},
                {"Sayuran Lengkap", "100000", "Sayur", "4"},
                {"Beef Wagiyu 0.5Kg", "600000", "Meat", "30"}
        };

        String[][][] Menu = { Makanan, FrozenFood, FreshFood };

        return Menu;
    }

    public static void displayDataMakanan(String[][][] Menu, Integer number) {
        /*
         * displayDataMakanan()
         * I : Menu, data array menu yang akan ditampilkan
         *     number, variable yang digunakan untuk menampilkan data no dari masing-masing menu
         * O : -
         * Ket : Fungsi ini tidak mengembalikan nilai apapun, karena kegunaannya hanya untuk menampilkan
         *       daftar menu yang dapat dibeli oleh pembeli
         * */

        for(Integer i = 0; i < Menu.length; i++) {
            if(number <= Menu[0].length) {
                System.out.println("  --------------------------------");
                System.out.println(" | Food →                         |");
                System.out.println("  --------------------------------");
            } else if(number > Menu[0].length && number <= Menu[0].length*2) {
                System.out.println("  --------------------------------");
                System.out.println(" | Frozen Food →                  |");
                System.out.println("  --------------------------------");
            } else if(number > Menu[0].length*2 && number <= Menu[0].length*3) {
                System.out.println("  --------------------------------");
                System.out.println(" | Fresh Food →                   |");
                System.out.println("  --------------------------------");
            }
            for(Integer j = 0; j < Menu[0].length; j++) {
                System.out.println(" | " + number + " | " + Menu[i][j][0] + " | Rp. " + Menu[i][j][1] );
                number++;
            }
        }
    }

    public static void menu(Scanner inputPembeli, String[][][] Menu) {
        /*
         * menu()
         * I : inputPembeli, object scanner yang digunakan untuk memasukkan inputan pembeli
         *     Menu, array multidimensi yang menampung nilai kumpulan list makanan yang akan digunakan
         *           untuk instansiasi object nanti
         * O : -
         * Ket : Fungsi ini tidak mengembalikan nilai apapun, dipergunakan untuk menampilkan menu tampilan
         *       serta menjalankan fungsi-fungsi tertentu dan melakukan instansiasi object Class Makanan, FrozenFood,
         *       FreshFood
         * */

        System.out.println("   ==============================");
        System.out.println("  /         BELANJA MAKANAN      \\");
        System.out.println("  ================================");
        System.out.println(" |          LIST MAKANAN          |");
        System.out.println("  ================================");

        Integer number = 1;
        Integer pilihMakanan;
        Integer jumlah;
        Integer jumlahArray = Menu[0].length;

        displayDataMakanan(Menu, number);

        System.out.println();
        System.out.println("  ================================");
        System.out.println(" |          PILIH MAKANAN         |");
        System.out.println("  ================================");
        Integer counter = 1;
        String pilihLagi = "Y";

        System.out.print(" | " + counter + " | Pilih No Makanan (1-9) → ");
        pilihMakanan = inputPembeli.nextInt();
        System.out.print(" |   | Jumlah  → ");
        jumlah = inputPembeli.nextInt();
        System.out.println("  --------------------------------");
        System.out.print(" | + | Pilih Lagi (Y/N) → ");
        pilihLagi = inputPembeli.next();
        System.out.println("  --------------------------------");

        Makanan makanan = new Makanan();
        if(pilihMakanan >= 1 && pilihMakanan <= jumlahArray) {
            makanan = new Makanan(Menu[0][pilihMakanan-1][0], Integer.parseInt((Menu[0][pilihMakanan-1][1])));
        } else if(pilihMakanan > jumlahArray && pilihMakanan <= (jumlahArray*2)) {
            makanan = new FrozenFood(Menu[1][(pilihMakanan-(Menu[0].length))-1][0], Integer.parseInt((Menu[1][(pilihMakanan-(Menu[0].length))-1][1])),
                    Double.parseDouble((Menu[1][(pilihMakanan-(Menu[0].length))-1][1])));
        } else if(pilihMakanan > (jumlahArray*2) && pilihMakanan <= (jumlahArray*3)) {
            makanan = new FreshFood(Menu[2][(pilihMakanan-(Menu[0].length*2))-1][0], Integer.parseInt((Menu[2][(pilihMakanan-(Menu[0].length*2))-1][1])),
                    Menu[2][(pilihMakanan-(Menu[0].length*2))-1][2], Integer.parseInt(Menu[2][(pilihMakanan-(Menu[0].length*2))-1][3]));
        }

        Chart keranjang = new Chart(makanan, jumlah);

        while(pilihLagi.equals("Y")) {
            counter++;
            System.out.print(" | " + counter + " | Pilih No Makanan (1-9) → ");
            pilihMakanan = inputPembeli.nextInt();
            System.out.print(" |   | Jumlah  → ");
            jumlah = inputPembeli.nextInt();

            if(pilihMakanan >= 1 && pilihMakanan <= jumlahArray) {
                keranjang.addMakanan(Menu[0][pilihMakanan-1][0], Integer.parseInt((Menu[0][pilihMakanan-1][1])), jumlah);
            } else if(pilihMakanan > jumlahArray && pilihMakanan <= (jumlahArray*2)) {
                keranjang.addMakanan(Menu[1][(pilihMakanan-(Menu[0].length))-1][0], Integer.parseInt((Menu[1][(pilihMakanan-(Menu[0].length))-1][1])),
                        Double.parseDouble((Menu[1][(pilihMakanan-(Menu[0].length))-1][2])), jumlah);
            } else if(pilihMakanan > (jumlahArray*2) && pilihMakanan <= (jumlahArray*3)) {
                keranjang.addMakanan(Menu[2][(pilihMakanan-(Menu[0].length*2))-1][0], Integer.parseInt((Menu[2][(pilihMakanan-(Menu[0].length*2))-1][1])),
                        Menu[2][(pilihMakanan-(Menu[0].length*2))-1][2], Integer.parseInt(Menu[2][(pilihMakanan-(Menu[0].length*2))-1][3]), jumlah);
            }

            System.out.println("  --------------------------------");
            System.out.print(" | + | Pilih Lagi (Y/N) → ");
            pilihLagi = inputPembeli.next();
            System.out.println("  --------------------------------");
        }

        keranjang.totalBelanja();

    }

}
