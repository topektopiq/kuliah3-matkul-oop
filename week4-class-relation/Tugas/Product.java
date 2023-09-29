package Tugas;

public class Product {
    private String idProduct;
    private String nameProduct;
    private int qty;

    Product() {

    }

    Product(String idProduct, String nameProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.qty = 0;
    }

    Product(String idProduct, String nameProduct, int qty) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.qty = qty;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQty() {
        return qty;
    }

    public void addQty(int value) {
        qty += value;
    }

    public void reduceQty(int value) {
        qty -= value;
    }

    public void printStatus() {
        System.out.println("ID Barang\t= " + idProduct);
        System.out.println("Nama Barang\t= " + nameProduct);
        System.out.println("Jumlah Barang\t= " + qty);
    }

}
