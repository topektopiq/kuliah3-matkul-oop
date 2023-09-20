package Tugas;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        boolean stop = false;

        do {
            System.out.println("---MENU---");
            System.out.println("1. Pinjaman");
            System.out.println("2. Angsuran");
            System.out.println("3. Lihat Sisa Pinjaman");
            System.out.println("4. Keluar");
            System.out.print("> Pilih Menu: ");
            int pilihMenu = sc.nextInt();
            switch (pilihMenu) {
                case 1:
                    System.out.print("> Jumlah Pinjaman: ");
                    donny.pinjam(sc.nextInt());
                    break;
                case 2:
                    System.out.print("> Jumlah Angsuran: ");
                    donny.angsur(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 4:
                    stop = true;
                    break;
                default:
                    break;
            }

        } while (!stop);    


        // System.out.println("\nMeminjam uang 10.000.000...");
        // donny.pinjam(10000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMembayar angsuran 1.000.000");
        // donny.angsur(1000000);

        // System.out.println("\nMembayar angsuran 20.000");
        // donny.angsur(20000);

        
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMembayar angsuran 3.000.000");
        // donny.angsur(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
