package id.mahasiswa;

public class Mahasiswa_Berprestasi extends Mahasiswa {

    // static variable
    private Integer jumlahMahasiswaBerprestasi = 0;

    // properties
    private double IPK;
    private String prestasi[] = new String[3];

    // constructor
    public Mahasiswa_Berprestasi(String NIM, String nama, String alamat, Integer jurusan, double IPK, String prestasi[]) {
        super(NIM, nama, alamat, jurusan);
        this.IPK = IPK;
        this.prestasi = prestasi;

        jumlahMahasiswaBerprestasi += 1;
    }

    // encapsulation
    // setter
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public void setPrestasi(String prestasi[]) {
        this.prestasi = prestasi;
    }

    // getter
    public double getIPK() { return this.IPK; }
    public String[] prestasi() { return this.prestasi; }


}
