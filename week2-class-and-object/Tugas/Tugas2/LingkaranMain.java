package Tugas.Tugas2;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.r = 12;
        System.out.println("Jari-jari\t\t: " + l.r);
        System.out.println("Luas lingkaran\t\t: " + l.hitungLuas());
        System.out.println("Keliling lingkaran\t: " + l.hitungKeliling());
    }
}
