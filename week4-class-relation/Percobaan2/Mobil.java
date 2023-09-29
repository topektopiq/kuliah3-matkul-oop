package Percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    Mobil(){

    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getBiaya() {
        return biaya;
    }

    public String getMerk() {
        return merk;
    }

    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
    
}


