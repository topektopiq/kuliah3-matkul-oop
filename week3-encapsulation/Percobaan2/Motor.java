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
            if(kecepatan >= 100){
                System.out.println("Kecepatan anda sudah maksimum");
            } else {
                kecepatan += 5;
            }
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