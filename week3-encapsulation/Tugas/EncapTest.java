package Tugas;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(20);

        System.out.println("Name: "+encap.getName());
        System.out.println("Age: "+encap.getAge());
    }
}