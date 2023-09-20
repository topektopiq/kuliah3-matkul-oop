package Latihan3;

public class PersegipanjangMain {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
    
        pp.panjang = 20;
        pp.lebar = 10;
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());
    }
}
