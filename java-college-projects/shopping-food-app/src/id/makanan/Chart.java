package id.makanan;

public class Chart {
    /*
     * Class Chart ( Keranjang )
     * → digunakan sebagai tempat penyimpanan / struktur data dari object-object Makanan, FrozenFood, FreshFood
     *   ketika user ingin membeli lebih dari satu item/makanan. Dimana Class ini berkonsepkan Struktur data Single
     *   Linked List
     * */

    // properties
    private Makanan head;
    private Makanan tail;

    // constructor
    public Chart(Makanan node, Integer jumlah) {
        /*
         * Chart()
         * I : node, merupakan tempat penyimpanan data makanan yang bertipe Makanan
         *     jumlah, merupakan variable untuk menyimpan nilai jumlah makanan yang dipesan oleh pembeli
         *             ( baik dari objek Makanan, FrozenFood, maupun, FreshFood )
         * O : -
         * Ket : Constructor ini digunakan sebagai awal pendeklarasian konsep Single Linked List dengan langsung memasukkan node
         * */

        this.head = node;
        head.setJumlah(jumlah);
        this.tail = head;
    }

    // methods
    public void addMakanan(String nama, Integer harga, Integer jumlah) {
        /*
         * addMakanan()
         * I : nama, data berupa nama makanan yang akan dimasukkan ke properti object Makanan
         *     harga, data berupa harga makanan yang akan dimasukkan ke properti object Makanan
         *     jumlah, data berupa jumlah makanan yang akan dibeli oleh pembeli ke properti object Makanan
         * O : -
         * Ket : Method ini tidak mengembalikan nilai apapun, digunakan untuk membuat instansiasi/object baru dari kelas Makanan
         *       lalu menambahkannya ke Struktur data Single Linked List untuk list makanan yang dibeli oleh pembeli
         * */

        Makanan newNode = new Makanan(nama, harga);
        newNode.setJumlah(jumlah);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    // overloading method : addMakanan untuk FrozenFood
    public void addMakanan(String nama, Integer harga, double suhuSimpan, Integer jumlah) {
        /*
         * addMakanan()
         * I : nama, data berupa nama makanan
         *     harga, data berupa harga makanan
         *     jumlah, data berupa jumlah makanan
         *     suhuSimpan, data berupa suhu makanan yang dibeli harus disimpan dalam berapa derajat
         * O : -
         * Ket : Method ini tidak mengembalikan nilai apapun, digunakan untuk membuat instansiasi/object baru dari kelas FrozenFood
         *       lalu menambahkannya ke Struktur data Single Linked List untuk list makanan yang dibeli oleh pembeli
         * */

        Makanan newNode = new FrozenFood(nama, harga, suhuSimpan);
        newNode.setJumlah(jumlah);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    // overloading method : addMakanan untuk FreshFood
    public void addMakanan(String nama, Integer harga, String jenis, Integer lamaSimpan, Integer jumlah) {
        /*
         * addMakanan()
         * I : nama, data berupa nama makanan
         *     harga, data berupa harga makanan
         *     jumlah, data berupa jumlah makanan
         *     jenis, data berupa jenis makanan fresh food apakah yang dibeli oleh pembeli
         *     lamaSimpan, data berupa lama simpan fresh food yang akan dibeli
         * O : -
         * Ket : Method ini tidak mengembalikan nilai apapun, digunakan untuk membuat instansiasi/object baru dari kelas FreshFood
         *       lalu menambahkannya ke Struktur data Single Linked List untuk list makanan yang dibeli oleh pembeli
         * */

        FreshFood newNode = new FreshFood(nama, harga, jenis, lamaSimpan);
        newNode.setJumlah(jumlah);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void totalBelanja() {
        /*
         * totalBelanja()
         * I : -
         * O : -
         * Ket : Method ini tidak mengembalikan nilai apapun, digunakan untuk melakukan perhitungan total harga belanjaan
         *       pembeli, perhitungan diskon, lalu perhitungan total bayar setelah di diskon
         * */

        Makanan curr = this.head;
        System.out.println();
        System.out.println("  ================================");
        System.out.println(" |          STRUK BELANJA         |");
        System.out.println("  ================================");
        Integer counter = 1;
        Integer totalHarga = 0;
        while(curr != null) {
            System.out.println(" | " + counter + " | " + curr.getNama() + " , Rp. " + curr.getHarga() + " * " + curr.getJumlah());
            curr.getInfo();
            if(curr.getNext() != null) System.out.println("  --------------------------------");

            totalHarga += (curr.getHarga() * curr.getJumlah());
            curr = curr.getNext();
            counter++;
        }
        System.out.println("  --------------------------------");
        System.out.println(" | Total      : Rp. " + totalHarga);
        if(totalHarga > 200000) {
            System.out.println(" | Diskon 10% : Rp. " + (int)(totalHarga*0.1));
            System.out.println(" | * Karena anda berbelanja lebih dari Rp. 200000");
            System.out.println("     Kamu mendapatkan diskon sebesar 10%");
            System.out.println("  --------------------------------");
            System.out.println(" | Total Belanja  : Rp. " + (totalHarga - (int)(totalHarga*0.1)));
        }
        System.out.println("  ================================");
        System.out.println(" |         SILAHKAN BAYAR         |");
        System.out.println("  ================================");

    }

}
