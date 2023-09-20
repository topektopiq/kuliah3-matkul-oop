package Tugas;

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