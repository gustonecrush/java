package id.user;

public class User_Premium extends User {

    // properties
    private Boolean premium;

    // constructor
    public User_Premium() {
        super();
        this.premium = true;
    }

    // methods
    public void transfer(Integer nominalTransfer) {
        Integer newSaldo;

        if(nominalTransfer > 500000) {
            newSaldo = this.eDompet.getSaldo() - nominalTransfer;
        } else {
            newSaldo = this.eDompet.getSaldo() - nominalTransfer - 10000;
        }

        this.eDompet.setSaldo(newSaldo);
    }

}
