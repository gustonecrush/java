package id.college;

public class Customer {

    // properties
    private String orderName;
    public Menu orders;

    // static variable
    private static Integer countOrdering;

    // constructor
    public Customer(String name, Menu orders) {
        this.orderName = name;
        this.orders = orders;
    }

    // overloading
    public Customer(String name) {
        this.orderName = name;
    }

    // methods

    // encapsulation
    public String getOrderName() { return this.orderName; }
    public Menu getOrders() { return this.orders; }

    public void setOrderName(String name) { this.orderName = name; }
    public void setOrders(Menu menu) {
        this.orders = menu;
    }

    // overloading
    public void setOrders() {
        this.orders = new Menu("Burger", 15000);
    }

}
