package Latihan1;

public class Mahasiswa {
    String nim;
    String namaMhs;
    MataKuliah[] mataKuliahs;

    Mahasiswa(String nim, String namaMhs, int mataKuliah){
        this.nim = nim;
        this.namaMhs = namaMhs;
        mataKuliahs = new MataKuliah[mataKuliah];
    }

    void printNilai(){
        for (int a = 0; a < mataKuliahs.length; a++) {
            System.out.println("Nilai "+mataKuliahs[a].getNamaMk()+" = "+mataKuliahs[a].getNilaiMK());
        }
    }

    String getNim(){
        return nim;
    }

    String getNamaMhs() {
        return namaMhs;
    }

}
