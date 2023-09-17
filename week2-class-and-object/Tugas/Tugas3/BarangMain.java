package Tugas.Tugas3;

public class BarangMain {
    public static void main(String[] args) {
        Barang b = new Barang();
        b.kode = "001";
        b.namaBarang = "Buku";
        b.hargaDasar = 60000;
        b.diskon = 10;
        b.tampilData();
    }
}
