package id.makanan;

public class Makanan {

    // properties
    private String nama;
    private Integer harga;
    protected Integer jumlah;
    private Makanan next; // untuk keperluan struktur data

    // constructor
    public Makanan(String nama, Integer harga) {
        this.nama = nama;
        this.harga = harga;
        this.next = null;
    }

    // overloading constructor
    public Makanan() {
        this.nama = "";
        this.harga = 0;
        this.next = null;
    }

    // encapsulations
    public void setNama(String nama) { this.nama = nama; }
    public void setHarga(Integer harga) { this.harga = harga; }
    public void setNext(Makanan next) { this.next = next; }
    public void setJumlah(Integer jumlah) { this.jumlah = jumlah; }

    public String getNama() { return this.nama; }
    public Integer getHarga() { return this.harga; }
    public Makanan getNext() { return this.next; }
    public Integer getJumlah() { return this.jumlah; }

    // methods
    public void getInfo() {

    }

}
