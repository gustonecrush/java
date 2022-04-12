package id.college;

public class Menu {

    // methods
    private String name;
    private Integer price;
    public Integer countOrderMenu;
    public Integer totalPrice;

    // constructor
    public Menu(String name, Integer price) {
        this.name  = name;
        this.price = price;
    }

    public Menu() {
        this.name = "";
        this.price = 0;
    }

    // encapsulation
    public String getName() { return this.name; }
    public Integer getPrice() { return this.price; }
    public Integer getTotalPrice() { return this.totalPrice; }

}
