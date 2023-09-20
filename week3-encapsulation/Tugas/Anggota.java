package Tugas;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    Anggota(String noKtp, String nama, int limitPinjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int setor){
        if(setor>limitPinjaman || (jumlahPinjaman+setor) > limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += setor;
        }
    }

    // public void angsur(int angsur){
    //     if(jumlahPinjaman == 0){
    //         jumlahPinjaman = 0;
    //     } else {
    //         jumlahPinjaman -= angsur;
    //     }
    // }
    
    
    //MODIFIKASI
    public void angsur(int angsur){
        double min = (double)jumlahPinjaman * 0.1;
        if(jumlahPinjaman == 0){
            jumlahPinjaman = 0;
        } else {
            if(angsur < min){
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            } else {
                jumlahPinjaman -= angsur;
            }
        }
    }

}
