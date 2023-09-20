# Jobsheet 3 Object Oriented Programming - Encapsulation

## Percobaan 1

Class Motor

```java
public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
```

Demo

```java
public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}
```

Hasil Running

```terminal
Kontak Off
Kecepatan 100

Kecepatan tidak bisa beretambah karena mesin Off

Kontak On
Kecepatan 100

Kecepatan anda sudah maksimum
Kontak On
Kecepatan 100

Kecepatan anda sudah maksimum
Kontak On
Kecepatan 100

Kecepatan anda sudah maksimum
Kontak On
Kecepatan 100

Kontak Off
Kecepatan 100

```

Terdapat kejanggalan pada kode di class Motor. Atrribute pada class tersebut seharusnya tidak dapat diakses langsung oleh class lain.

## Percobaan 2 - Access Modifier

Class Motor (dengan access modifier atribut private)

```java
public class Motor {
    public int kecepatan = 100;
    public boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
    }

    public void tambahKecepatan() {
        if (kontakOn) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa beretambah karena mesin Off \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa beretambah karena mesin Off \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
```

Demo

```java
public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}
```

Hasil Running

```terminal
Kontak Off
Kecepatan 100

Kecepatan tidak bisa beretambah karena mesin Off

Kontak On
Kecepatan 100

Kecepatan anda sudah maksimum
Kontak On
Kecepatan 100

Kecepatan anda sudah maksimum
Kontak On
Kecepatan 100

Kecepatan anda sudah maksimum
Kontak On
Kecepatan 100

Kontak Off
Kecepatan 100

```

Dari percobaan diatas, dapat kita amati sekarang atribut kecepatan tidak bisa diakses oleh pengguna dan diganti nilainya secara sembarangan.

## Pertanyaan

1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?<br>
   **Jawab:** Karena atribut kontakOn pada class motor memiliki default value false. Ketika objek
   pertamakali di instansiasi, atribut kontakOn akan bernilai false sehingga tidak dapat menambah
   kecepatan.<br><br>
2. Mengapat atribut kecepatan dan kontakOn diset private?<br>
   **Jawab:** Karena untuk menghindari akses langsung dari class lain yang menggunakan class Motor. <br><br>
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!<br>
   **Jawab:**

```java
    public void tambahKecepatan() {
        if (kontakOn) {
            if(kecepatan >= 100){
                System.out.println("Kecepatan anda sudah maksimum");
            } else {
                kecepatan += 5;
            }
        } else {
            System.out.println("Kecepatan tidak bisa beretambah karena mesin Off \n");
        }
    }
```

## Percobaan 3 - Getter and Setter

Class Anggota

```java
public class Anggota {

    private String nama;
    private String alamat;
    private float simpanan;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang){
        simpanan += uang;
    }

    public void pinjam(float uang){
        simpanan -= uang;
    }

}
```

Demo

```java
public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

    }
}
```

Hasil Running

```terminal
Simpanan Iwan Setiawan: 100000.0
Simpanan Iwan Setiawan: 95000.0
```

## Percobaan 4 - Constructor and Instanttiation

Class KoperasiDemo (Modifikasi dari class demo Percobaan 3)

```java
public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();

        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

    }
}
```

Hasil Running

```terminal
Simpanan null: 0.0
Simpanan Iwan Setiawan: 100000.0
Simpanan Iwan Setiawan: 95000.0
```

Modifikasi Class Anggota

```java
public class Anggota {

    private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }

}
```

Modifikasi Class KoperasiDemo

```java
public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar");

        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + ": " + anggota1.getSimpanan());

    }
}
```

Hasil Running

```terminal
Simpanan Iwan: 0.0
Simpanan Iwan Setiawan: 100000.0
Simpanan Iwan Setiawan: 95000.0
```

## Pertanyaan

1. Apa yang dimaksud getter dan setter?<br>
   **Jawab:** Setter dan getter adalah fungsi yang berfungsi untuk berinteraksi dengan atribut. Setter berfungsi untuk memberikan nilai kepada atribut dan getter berfungsi memberikan/mengembalikan nilai kepada class yang memanggilnya.<br><br>
2. Apa kegunaan dari method getSimpanan()?<br>
   **Jawab:** Untuk mendapatkan nilai dari atribut simpanan pada class anggota.<br><br>
3. Method apa yang digunakan untk menambah saldo?<br>
   **Jawab:** Method yang digunakan untuk menambah saldo adalah method setor().<br><br>
4. Apa yand dimaksud konstruktor?<br>
   **Jawab:** Konstruktor adalah fungsi khusus yang digunakan ketika class digunakan pertama kali menjadi objek pada class lain.<br><br>
5. Sebutkan aturan dalam membuat konstruktor?<br>
   **Jawab:** Terdapat nama konstruktor yang berupa nama class itu sendiri dan bisa disertai parameter atau tidak disertai parameter. Konstruktor tidak memiliki tipe data. Access Modifier pada konstruktor adalah public dan tidak boleh diganti. Di dalam konstruktor juga dapat diberikan program inisialisasi kepada atribut ataupun yang lainnya.<br><br>
6. Apakah boleh konstruktor bertipe private?<br>
   **Jawab:** Konstruktor tidak dapat bertipe private karena konstruktor harus bisa diakses oleh class lain yang menggunakan class berkonstruktor.<br><br>
7. Kapan menggunakan parameter dengan passsing parameter?<br>
   **Jawab:** Ketika di dalam konstruktor terdapat proses pemberian nilai pada atribut dari class lain ketika pertama kali pembuatan object.<br><br>
8. Apa perbedaan atribut class dan instansiasi atribut?<br>
   **Jawab:** Atribut class dapat digunakan tanpa adanya instansiasi object sedangkan instansiasi atribut hanya dapat digunakan ketika sudah melakukan instansiasi object. Akses atribut class dilakukan dengan memanggil nama class sedangkan instansiasi atribut dilakukan dengan memanggil nama object.<br><br>
9. Apa perbedaan class method dan instansiasi method?<br>
   **Jawab:** Class method dapat digunakan tanpa adanya instansiasi object sedangkan instansiasi method hanya dapat digunakan ketika sudah melakukan instansiasi object. Akses class method dilakukan dengan memanggil nama class sedangkan instansiasi method dilakukan dengan memanggil nama object.<br><br>

## Tugas

1. Cobalah program dibawah ini dan tuliskan hasil outputnya

Class EncapDemo

```java
public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge>30) {
            age = 30;
        } else {
            age = newAge;
        }
    }
}
```

Class EncapTest

```java
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name: "+encap.getName());
        System.out.println("Age: "+encap.getAge());
    }
}
```

Hasil Running

```terminal
Name: James
Age: 30
```

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat
   ditampilkan ke layar nilainya 30, jelaskan mengapa?<br>
   **Jawab:** Karena di dalam class EncapDemo pada fungsi setAge terdapat kondisi yang akan memberikan
   nilai 30 pada age ketika nilai parameter lebih dari 30.<br>

3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18!<br>

Class EncapDemo

```java
public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge>=18 && newAge<=30) {
            age = newAge;
        } else if (newAge < 18){
            age = 18;
        } else {
            age = 30;
        }
    }
}
```

Class EncapTest

```java
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(20);

        System.out.println("Name: "+encap.getName());
        System.out.println("Age: "+encap.getAge());
    }
}
```

Hasil Running

```terminal
Name: James
Age: 20
```

4. Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class Anggota yang memiliki atribut antara lain nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah pinjaman akan berkurang sesuai dengan nominal yang diangsur. Buatlah class Anggota tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai dengan yang diharapkan<br>

Class Anggota

```java
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

    public void angsur(int angsur){
        if(jumlahPinjaman == 0){
            jumlahPinjaman = 0;
        } else {
            jumlahPinjaman -= angsur;
        }
    }
}
```

Class TestKoperasi

```java
public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());


        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
```

Hasil Running

```terminal
Nama Anggota: Donny
Limit Pinjaman: 5000000

Meminjam uang 10.000.000...
Maaf, jumlah pinjaman melebihi limit.
Jumlah pinjaman saat ini: 0

Meminjam uang 4.000.000...
Jumlah pinjaman saat ini: 4000000

Membayar angsuran 1.000.000
Jumlah pinjaman saat ini: 3000000

Membayar angsuran 3.000.000
Jumlah pinjaman saat ini: 0
```

5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah
   pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf,
   angsuran harus 10% dari jumlah pinjaman”.<br>

Class Anggota

```java
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
```

Class TestKoperasi

```java
public class TestKoperasi {
    public static void main(String[] args) {

        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);

        System.out.println("\nMembayar angsuran 20.000");
        donny.angsur(20000);


        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
```

Hasil Running

```terminal
Nama Anggota: Donny
Limit Pinjaman: 5000000

Meminjam uang 10.000.000...
Maaf, jumlah pinjaman melebihi limit.
Jumlah pinjaman saat ini: 0

Meminjam uang 4.000.000...
Jumlah pinjaman saat ini: 4000000

Membayar angsuran 1.000.000

Membayar angsuran 20.000
Maaf, angsuran harus 10% dari jumlah pinjaman
Jumlah pinjaman saat ini: 3000000

Membayar angsuran 3.000.000
Jumlah pinjaman saat ini: 0
```

6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input dari console!<br>

Class TestKoperasi

```java
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
    }
}
```

Hasil Running

```terminal
Nama Anggota: Donny
Limit Pinjaman: 5000000
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 1
> Jumlah Pinjaman: 1000000
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 1
> Jumlah Pinjaman: 1000000
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 3
Jumlah pinjaman saat ini: 2000000
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 1
> Jumlah Pinjaman: 9000000
Maaf, jumlah pinjaman melebihi limit.
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 2
> Jumlah Angsuran: 10000
Maaf, angsuran harus 10% dari jumlah pinjaman
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 3
Jumlah pinjaman saat ini: 2000000
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 3
Jumlah pinjaman saat ini: 2000000
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 2
> Jumlah Angsuran: 400000
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 3
Jumlah pinjaman saat ini: 1600000
---MENU---
1. Pinjaman
2. Angsuran
3. Lihat Sisa Pinjaman
4. Keluar
> Pilih Menu: 4
```
