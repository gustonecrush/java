package id.makanan;

public class FrozenFood extends Makanan {

    // properties
    private double suhuSimpan;

    // constructor
    public FrozenFood(String nama, Integer harga, double suhuSimpan) {
        super(nama, harga);
        this.suhuSimpan = suhuSimpan;
    }

    // encapsulations
    public void setSuhuSimpan(Integer suhuSimpan) { this.suhuSimpan = suhuSimpan; }
    public double getSuhuSimpan() { return this.suhuSimpan; }

    public void getInfo() {
        System.out.println(" | * | Frozen Food → ");
        System.out.println(" |   | Suhu Simpan : " + getSuhuSimpan() + "°C");
    }

}
