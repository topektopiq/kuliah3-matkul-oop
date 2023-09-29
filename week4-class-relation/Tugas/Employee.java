package Tugas;

public class Employee {
    private String idEmployee;
    private String nameEmployee;

    Employee(){
        
    }

    Employee(String idEmployee, String nameEmployee){
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }
  
    public void deliverStock(Warehouse warehouse, String idProduct, int value){
        warehouse.addStock(idProduct, value);
    }

    public void pickUpStock(Warehouse warehouse, String idProduct, int value){
        warehouse.reduceStock(idProduct, value);
    }

}
