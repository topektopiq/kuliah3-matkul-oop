package Tugas.Tugas1;

public class Peminjaman {

    public String id;
    public String nama;
    public String namaGame;
    public int harga;

    public void tampilPeminjaman(){
        System.out.println("Id\t\t: " + id);
        System.out.println("Nama Member\t: " + nama);
        System.out.println("Nama Game\t: " + namaGame);
        System.out.println("Harga\t\t: " + harga);
    }

    public int hitungHarga(int lama, int hargaSewa){
        return lama * hargaSewa;
    }
    
}