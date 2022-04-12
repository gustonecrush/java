package id.college;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instansiate scanner for input customer
        Scanner inputCustomer = new Scanner(System.in);

        // Instansiate menu
        Menu listMenu[] = menuInstansiate();

        // Call menu view
        menuView(inputCustomer, listMenu);

    }

    public static Menu[] menuInstansiate() {
        // Instansiate Menu list
        Menu menu1 = new Menu("Big Mac", 34500);
        Menu menu2 = new Menu("Triple Burger with Cheese", 40000);
        Menu menu3 = new Menu("Double Cheese Burger", 33000);
        Menu menu4 = new Menu("Cheese Burger Deluxe", 26500);
        Menu menu5 = new Menu("Cheese Burger with Egg", 27000);
        Menu menu6 = new Menu("Cheese Burger", 26500);
        Menu menu7 = new Menu("Beef Burger", 14500);
        Menu menu8 = new Menu("Fruit Tea Lemon", 8000);
        Menu menu9 = new Menu("Coca Cola", 8000);

        Menu menus[] = {menu1, menu2, menu3, menu4, menu5, menu6, menu7, menu8, menu9};

        return menus;
    }

    public static void bannerView() {
        System.out.println("  _______________________");
        System.out.println(" /                       \\");
        System.out.println(" =========================");
        System.out.println("|      MCD DRIVE THRU     |");
        System.out.println(" =========================");
    }

    public static void menuView(Scanner inputCustomer, Menu[] menu) {
        boolean exit = false;
        Integer chooseMenu;

        bannerView();

        while(!exit) {
            System.out.println(" =========================");
            System.out.println("|           MENU          |");
            System.out.println(" =========================");
            System.out.println("| 1. Order Foods & Drinks |");
            System.out.println("| 2. Exit                 |");
            System.out.println(" =========================");
            System.out.print  ("| Choose Menu : ");
            chooseMenu = inputCustomer.nextInt();

            switch(chooseMenu) {
                case 1:
                    String customer;
                    Integer noMenu;
                    Integer stop = 0;
                    String chooseFoodDrinks;
                    Customer cust = new Customer("");

                    System.out.println(" =========================");
                    System.out.println("|    🌭🍡 LIST MENU 🍔🍦   |");
                    System.out.println(" =========================");
                    for(Integer i = 0; i < menu.length; i++) {
                        System.out.println("| " + i + " → " + menu[i].getName() + " | Rp. " + menu[i].getPrice());
                    }
                    System.out.println(" =========================");
                    System.out.println("|        ORDER NAME       |");
                    System.out.println(" =========================");
                    System.out.print  ("| Enter Name → ");
                    customer = inputCustomer.next();

                    System.out.println(" =========================");
                    System.out.println("|  CHOOSE FOOD & DRINKS   |");
                    System.out.println(" =========================");

                    System.out.print("| Enter No Menu (0-" + (menu.length-1) + ") → ");
                    noMenu = inputCustomer.nextInt();

                    System.out.print("| Enter Amount        → ");
                    menu[noMenu].countOrderMenu = inputCustomer.nextInt();
                    menu[noMenu].totalPrice     = menu[noMenu].getPrice() * menu[noMenu].countOrderMenu;

                    System.out.println(" =========================");

                    cust.setOrders(menu[noMenu]);
                    cust.setOrderName(customer);

                    System.out.println(" =========================");
                    System.out.println("|          ORDERS         |");
                    System.out.println(" =========================");
                    System.out.println("| Name   → " + cust.getOrderName() + "");
                    System.out.print("| Orders → ");
                    System.out.println(cust.orders.getName() + " | Rp. " + cust.orders.getPrice() );
                    System.out.println("| Total  → Rp. " + cust.orders.totalPrice);

                    System.out.println(" =========================");
                    System.out.println("|     ENJOY YOUR MEAL     |");
                    System.out.println(" =========================");

                break;
                case 2:
                    System.out.println(" =========================");
                    System.out.println("|      I'M LOVIN' IT      |");
                    System.out.println(" =========================");
                    exit = true;
                break;
                default:
                    System.out.println("Menu");
                break;
            }
        }

    }
}
