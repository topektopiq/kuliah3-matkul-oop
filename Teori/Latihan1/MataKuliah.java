package Latihan1;

public class MataKuliah {

    String kodeMk;
    String namaMk;
    int nilaiMK;

    MataKuliah(String kodeMk, String namaMk){
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
    }

    String getKodeMk() {
        return kodeMk;
    }

    String getNamaMk() {
        return namaMk;
    }

    int getNilaiMK() {
        return nilaiMK;
    }

}
