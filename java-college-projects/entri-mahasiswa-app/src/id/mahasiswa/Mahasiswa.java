package id.mahasiswa;

public class Mahasiswa {

    // static variable
    private static String universitas = "Universitas Sriwijaya";
    private static Integer jumlahMahasiswa = 0;

    // properties
    private String NIM, nama, alamat;
    private Integer jurusan;
    private Integer kodeJurusan[] = {61, 62, 63, 64, 65, 66};

    // constructor
    public Mahasiswa(String NIM, String nama, String alamat, Integer jurusan) {
        this.NIM = NIM;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;

        jumlahMahasiswa += 1;
    }

    // encapsulations
    // setter
    public static void setUniversitas(String newUniversitas) { universitas = newUniversitas; }
    public void setNIM(String NIM) { this.NIM = NIM; }
    public void setNama(String nama) { this.nama = nama; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public void setJurusan(Integer jurusan) { this.jurusan = jurusan; }

    // getter
    public static String getUniversitas() { return universitas; }
    public String getNIM() { return this.NIM; }
    public String getNama() { return this.nama; }
    public String getAlamat() { return this.alamat; }

    // method static
    public static void displayDataMahasiswa(Mahasiswa mahasiswa[]) {
        System.out.println(" ==========================");
        System.out.println("|       DATA MAHASISWA     |");
        System.out.println(" ==========================");

        int lengthMahasiswa = mahasiswa.length;

        for(Integer i = 0; i < lengthMahasiswa; i++) {
            System.out.println("| " + (i+1) + " | " + mahasiswa[i].getNama() + " | " + mahasiswa[i].getNIM() + " | " +
                    mahasiswa[i].getAlamat() + " | " + mahasiswa[i].getJurusan(mahasiswa[i].jurusan) );
        }

    }

    public String getJurusan(Integer jurusan) {
        if(this.jurusan == kodeJurusan[0]) {
            return "Matematika";
        } else if(this.jurusan == kodeJurusan[1]) {
            return "Biologi";
        } else if(this.jurusan == kodeJurusan[2]) {
            return "Kimia";
        } else if(this.jurusan == kodeJurusan[3]) {
            return "Fisika";
        } else if(this.jurusan == kodeJurusan[4]) {
            return "Teknik Informatika";
        } else if(this.jurusan == kodeJurusan[5]) {
            return "Teknik Arsitektur";
        }
        return "";
    }


}


