package Latihan1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dosen[] dataDosen = new Dosen[5];

        dataDosen[0] = new Dosen("D001", "Doni");
        dataDosen[1] = new Dosen("D002", "Nana");
        dataDosen[2] = new Dosen("D003", "Cahya");
        dataDosen[3] = new Dosen("D004", "Lukman");
        dataDosen[4] = new Dosen("D005", "Andi");

        MataKuliah[] dataMk = new MataKuliah[4];

        dataMk[0] = new MataKuliah("MK01", "PBO");
        dataMk[1] = new MataKuliah("MK02", "Desain Web");
        dataMk[2] = new MataKuliah("MK03", "Manajemen Proyek");
        dataMk[3] = new MataKuliah("MK04", "Matematika");

        Mahasiswa[] dataMhs = new Mahasiswa[2];

        dataMhs[0] = new Mahasiswa("MHS1", "Ahmad", 4);
        dataMhs[1] = new Mahasiswa("MHS2", "Taufiq", 4);

        for (int a = 0; a < dataMhs.length; a++) {
            for (int b = 0; b < dataMk.length; b++) {
                dataMhs[a].mataKuliahs[b] = dataMk[b];
            }
        }

        boolean exit = false;

        do {

            System.out.println("1. Input Nilai");
            System.out.println("2. Lihat Nilai");
            System.out.println("3. Keluar");
            System.out.print("> Piih Menu: ");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:

                    exit = false;

                    System.out.print("Masukkan NIP: ");
                    String nipTemp = sc.next();
                    sc.nextLine();

                    if (checkNip(dataDosen, nipTemp)) {
                        System.out.print("Masukkan NIM: ");
                        String nimTemp = sc.nextLine();
                        System.out.print("Masukkan Kode MK: ");
                        String kodeMkTemp = sc.nextLine();

                        if (checkNim(dataMhs, nimTemp)) {
                            int idMhs = findMhs(dataMhs, nimTemp);
                            if (checkKodeMk(dataMhs[idMhs].mataKuliahs, kodeMkTemp)) {
                                int idMk = findMk(dataMk, kodeMkTemp);
                                System.out
                                        .print("Masukkan Nilai " + dataMhs[idMhs].mataKuliahs[idMk].getNamaMk() + ": ");
                                dataMhs[idMhs].mataKuliahs[idMk].nilaiMK = sc.nextInt();
                            } else {
                                System.out.println("Mata Kuliah Tidak Ditemukan");
                            }
                        } else {
                            System.out.println("Mahasiswa Tidak Ditemukan");
                        }

                    } else {
                        System.out.println("NIP Tidak Ditemukan");
                    }

                    break;

                case 2:
                    exit = false;

                    System.out.print("Masukkan NIM: ");
                    String nimTemp = sc.next();
                    sc.nextLine();

                    if (checkNim(dataMhs, nimTemp)) {
                        int idMhs = findMhs(dataMhs, nimTemp);

                        dataMhs[idMhs].printNilai();

                    } else {
                        System.out.println("Mahasiswa Tidak Ditemukan");
                    }
                    break;
                case 3:
                default:
                    exit = true;
                    break;
            }
        } while (!exit);

    }

    static boolean checkNip(Dosen[] arr, String nip) {
        for (int a = 0; a < arr.length; a++) {
            if (arr[a].nip.equals(nip)) {
                return true;
            }
        }
        return false;
    }

    static boolean checkNim(Mahasiswa[] arr, String nim) {
        for (int a = 0; a < arr.length; a++) {
            if (arr[a].nim.equals(nim)) {
                return true;
            }
        }
        return false;
    }

    static int findMhs(Mahasiswa[] arr, String nim) {
        for (int a = 0; a < arr.length; a++) {

            if (arr[a].nim.equals(nim)) {
                return a;
            }
        }
        return -1;
    }

    static int findMk(MataKuliah[] arr, String kodeMk) {
        for (int a = 0; a < arr.length; a++) {
            if (arr[a].kodeMk.equals(kodeMk)) {
                return a;
            }
        }
        return -1;
    }

    static boolean checkKodeMk(MataKuliah[] arr, String kodeMk) {
        for (int a = 0; a < arr.length; a++) {
            if (arr[a].kodeMk.equals(kodeMk)) {
                return true;
            }
        }
        return false;
    }
}
