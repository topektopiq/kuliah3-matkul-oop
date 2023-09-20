package Latihan2;

public class Kalkulator {

    public int operan1;
    public int operan2;
    public float hasil;

    public void tambah() {
        System.out.println(operan1 + " + " + operan2 + " = " + (operan1 + operan2));
    }

    public void kurang() {
        System.out.println(operan1 + " - " + operan2 + " = " + (operan1 - operan2));
    }

    public void kali() {
        System.out.println(operan1 + " * " + operan2 + " = " + (operan1 * operan2));
    }

    public void bagi() {
        System.out.println(operan1 + " / " + operan2 + " = " + (operan1 / operan2));
    }

}
