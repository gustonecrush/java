package id.college;
import id.mahasiswa.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // instansiate scanner object
        Scanner inputUser = new Scanner(System.in);

        menuView(inputUser);

    }

    public static void menuView(Scanner inputUser) {

        String NIM, nama, alamat;
        Integer jurusan, chooseMenu;
        double IPK;
        String prestasi[] = new String[3];
        Mahasiswa listMahasiswa[] = new Mahasiswa[3];
        String lanjut = "Y";

        System.out.println(" ==========================");
        System.out.println("|    ENTRI DATA MAHASISWA  |");
        System.out.println(" ==========================");
        System.out.println("| 1. Mahasiswa             |");
        System.out.println("| 2. Mahasiswa Berprestasi |");
        System.out.println(" ==========================");
        System.out.print  ("| Choose Menu → ");
        chooseMenu = inputUser.nextInt();

        switch(chooseMenu) {
            case 1:
                Integer i = 0;
                while(lanjut.equals("Y")) {
                    System.out.println(" ==========================");
                    System.out.println("|         MAHASISWA        |");
                    System.out.println(" ==========================");
                    System.out.print  ("| 1 | Input NIM     → ");
                    NIM = inputUser.next();

                    System.out.print  ("| 2 | Input Nama    → ");
                    nama = inputUser.next();

                    System.out.print  ("| 3 | Input Alamat  → ");
                    alamat = inputUser.next();

                    System.out.print  ("| 4 | Input Kode Jurusan → ");
                    jurusan = inputUser.nextInt();

                    Mahasiswa mahasiswa = new Mahasiswa(NIM, nama, alamat, jurusan);

                    listMahasiswa[i] = mahasiswa;

                    System.out.println(" ==========================");
                    System.out.println("| Apakah Anda ingin memasukkan data lagi ? (Y) Ya; (T) Tidak");
                    System.out.print  ("| → ");
                    lanjut = inputUser.next();
                    i++;
                }
                Mahasiswa.displayDataMahasiswa(listMahasiswa);
            break;
            case 2:
                Integer j = 0;
                while(lanjut.equals("Y")) {
                    System.out.println(" ==========================");
                    System.out.println("|   MAHASISWA BERPRESTASI  |");
                    System.out.println(" ==========================");
                    System.out.print("| 1 | Input NIM     → ");
                    NIM = inputUser.next();

                    System.out.print("| 2 | Input Nama    → ");
                    nama = inputUser.next();

                    System.out.print("| 3 | Input Alamat  → ");
                    alamat = inputUser.next();

                    System.out.print("| 4 | Input Kode Jurusan   → ");
                    jurusan = inputUser.nextInt();

                    System.out.print("| 5 | Input IPK     → ");
                    IPK = inputUser.nextDouble();

                    System.out.print("| 6 | Input Prestasi Min-Max 3 → ");
                    for (Integer counter = 0; counter < prestasi.length; counter++) {
                        prestasi[counter] = inputUser.next();
                    }

                    Mahasiswa_Berprestasi mahasiswa = new Mahasiswa_Berprestasi(NIM, nama, alamat, jurusan, IPK, prestasi);
                    listMahasiswa[j] = mahasiswa;

                    System.out.println(" ==========================");
                    System.out.println("| Apakah Anda ingin memasukkan data lagi ? (Y) Ya; (T) Tidak");
                    System.out.print("| → ");

                    lanjut = inputUser.next();
                    j++;
                }
                Mahasiswa.displayDataMahasiswa(listMahasiswa);
            break;

        }
    }

}
