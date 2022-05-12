package id.user;

import id.dompet.Dompet;

public class User {

    // properties
    protected String name, email;
    protected Dompet eDompet;

    // constructor
    public User() {
        this.name = "User";
        this.email = "user@gmail.co.id";
        this.eDompet = new Dompet();
    }

    // methods
    public void getInfoDompet() {
        System.out.println("| + | Nama  : " + this.getName());
        System.out.println("| + | Email : " + this.getEmail());
        System.out.println("| + | Saldo : Rp. " + eDompet.getSaldo());
        System.out.println("| + | Point : " + eDompet.getPoint() + " point");
    }

    public void topUp(Integer tambahSaldo) {
        Integer newSaldo = this.eDompet.getSaldo() + tambahSaldo;
        this.eDompet.setSaldo(newSaldo); // menambah saldo
    }

    public void pembayaranNonTunai(Integer bayar) {
        Integer newSaldo = this.eDompet.getSaldo() - bayar;
        this.eDompet.setSaldo(newSaldo); // dapat mengurangi saldo
        System.out.println("| ! | Transaksi Pembayaran Sukses  |");

        if(bayar > 100000) {
            Integer newPoint = this.eDompet.getPoint() + 10;
            this.eDompet.setPoint(newPoint); // poin nambah
            System.out.println("| ! | Anda mendapat 10 poin ");
            System.out.println("      dari transaksi diatas Rp. 100000");
        }
    }

    // encapsulations
    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public void setName(String newName) { this.name = newName; }
    public void setEmail(String newEmail) { this.email = newEmail; }


}
