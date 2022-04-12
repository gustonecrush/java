package id.makanan;

public class FreshFood extends Makanan {

    // properties
    private String jenis;
    private Integer lamaSimpan;

    // constructor
    public FreshFood(String nama, Integer harga, String jenis, Integer lamaSimpan) {
        super(nama, harga);
        this.jenis = jenis;
        this.lamaSimpan = lamaSimpan;
    }

    // overloading constructor
    public FreshFood() {
        super("", 0);
        this.jenis = "";
    }

    // encapsulations
    public void setJenis(String jenis) { this.jenis = jenis; }
    public String getJenis() { return this.jenis; }

    public void setLamaSimpan(Integer lamaSimpan) { this.lamaSimpan = lamaSimpan; }
    public Integer getLamaSimpan() { return this.lamaSimpan; }

    public void getInfo() {
        System.out.println(" | * | Fresh Food → ");
        System.out.println(" |   | Lama Simpan : " + getLamaSimpan() + " hari | Jenis : " + getJenis());
    }

}
