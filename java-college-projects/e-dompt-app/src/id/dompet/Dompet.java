package id.dompet;

public class Dompet {

    // properties
    private Integer saldo;
    private Integer point;

    // constructor
    public Dompet() {
        this.saldo = 0;
        this.point = 0;
    }

    // encapsulations
    public Integer getPoint() { return this.point; }
    public Integer getSaldo() { return this.saldo; }
    public void setPoint(Integer point) { this.point = point; }
    public void setSaldo(Integer saldo) { this.saldo = saldo; }

}
