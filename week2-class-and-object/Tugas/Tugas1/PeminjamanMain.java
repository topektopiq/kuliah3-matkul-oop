package Tugas.Tugas1;

public class PeminjamanMain {
    public static void main(String[] args) {
        
        Peminjaman pj = new Peminjaman();
        pj.id = "0001";
        pj.nama = "Budi";
        pj.namaGame = "Zuma";
        pj.harga = pj.hitungHarga(24, 20000);
        pj.tampilPeminjaman();

    }
}