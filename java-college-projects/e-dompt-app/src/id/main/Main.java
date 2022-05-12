package id.main;

import id.user.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        User userDompet = new User();
        Scanner inputUser = new Scanner(System.in);
        menu(inputUser, userDompet);

    }

    public static void menu(Scanner inputUser, User userDompet) throws Exception {

        Integer pilihMenu;

        System.out.println(" ==================================");
        System.out.println("/        WELCOME TO E-DOMPET       \\");
        System.out.println(" ==================================");
        System.out.println("| 1 | Cek E-Dompet                 |");
        System.out.println("| 2 | Top-up Saldo                 |");
        System.out.println("| 3 | Pembayaran Non-tunai         |");
        System.out.println("| 4 | Keluar                       |");
        System.out.println(" ================================== ");
        System.out.print  ("| * | Pilih Menu (1-4) : ");
        pilihMenu = inputUser.nextInt();

        while(pilihMenu != 4) {
            switch (pilihMenu) {
                case 1:
                    System.out.println(" ================================== ");
                    System.out.println("|           CEK E-DOMPET           |");
                    System.out.println(" ==================================");
                    userDompet.getInfoDompet();
                break;
                case 2:
                    Integer topUpSaldo = 0;

                    System.out.println(" ================================== ");
                    System.out.println("|           TOP-UP SALDO           |");
                    System.out.println(" ==================================");
                    System.out.print  ("| + | Top-up : Rp. ");
                    topUpSaldo = inputUser.nextInt();
                    userDompet.topUp(topUpSaldo);
                    System.out.println("| ! | Saldo anda telah ditop-up    |");
                break;
                case 3:
                    Integer bayarNonTunai = 0;

                    System.out.println(" ================================== ");
                    System.out.println("|       PEMBAYARAN NON-TUNAI       |");
                    System.out.println(" ==================================");
                    System.out.print  ("| + | Jumlah Bayar : Rp. ");
                    bayarNonTunai = inputUser.nextInt();
                    userDompet.pembayaranNonTunai(bayarNonTunai);
                break;
                case 4:
                    System.exit(0);
                break;
                default:
                    System.out.println("Menu tidak tersedia");
                break;
            }
            System.out.println(" ================================== ");
            System.out.print  ("| * | Pilih Menu (1-4) : ");
            pilihMenu = inputUser.nextInt();
        }

    }

}
