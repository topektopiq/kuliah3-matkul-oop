package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        Product p1 = new Product("P01", "Mouse");
        Product p2 = new Product("P02", "Keyboard");
        Product p3 = new Product("P03", "Case Phone");

        Category c1 = new Category("C01", "Computer Accessoris", 2);
        c1.addProduct(p1);
        c1.addProduct(p2);
        
        Category c2 = new Category("C02", "Phone Accessoris", 1);
        c2.addProduct(p3);

        Category[] ca = new Category[2];
        ca[0] = new Category(); 
        ca[0] = c1; 
        ca[1] = new Category(); 
        ca[1] = c2; 
        

        Warehouse warehouse = new Warehouse(ca);

        Employee e = new Employee("E1", "Taufiq");

        e.deliverStock(warehouse, "P01", 12);
        e.deliverStock(warehouse, "P03", 5);
        e.deliverStock(warehouse, "P02", 20);
        warehouse.printStatus();

        e.pickUpStock(warehouse, "P03", 2);
        e.pickUpStock(warehouse, "P02", 5);

        warehouse.printStatus();
        
    }
}
