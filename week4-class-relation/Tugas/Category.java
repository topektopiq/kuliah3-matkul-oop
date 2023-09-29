package Tugas;

public class Category {
    private String idCategory;
    private String nameCategory;
    private Product[] products;
    private int productAmount;
    private int productCount;

    Category(){

    }

    Category(String idCategory, String nameCategory, int productAmount) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.products = new Product[productAmount];
        initProducts(productAmount);
        this.productAmount = productAmount;
        this.productCount = 0;
    }

    Category(String idCategory, String nameCategory, Product[] products) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.products = products;
        this.productAmount = products.length;
        this.productCount = productAmount;
    }

    private void initProducts(int productAmount) {
        for (int i = 0; i < productAmount; i++) {
            products[i] = new Product();
        }
    }

    public String getIdCategory() {
        return idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void addProduct(Product product) {
        if (productCount == productAmount) {
            System.out.println("Product Penuh!!");
        } else if (products[productCount].getIdProduct() == null) {
            this.products[productCount] = product;
            productCount++;
        }
    }

    public int indexOfProduct(String productId) {
        for (int i = 0; i < productAmount; i++) {
            if (products[i].getIdProduct() == productId) {
                return i;
            }
        }
        return -1;
    }

    public void addStock(String productId, int stock) {
        for (int i = 0; i < productAmount; i++) {
            if (products[i].getIdProduct() == productId) {
                products[i].addQty(stock);
            }
        }
    }

    public void reduceStock(String productId, int stock) {
        for (int i = 0; i < productAmount; i++) {
            if (products[i].getIdProduct() == productId) {
                products[i].reduceQty(stock);
            }
        }
    }

    public int getCategoryStock() {
        int qty = 0;
        for (int i = 0; i < productAmount; i++) {
            qty += products[i].getQty();
        }
        return qty;
    }

    public void printStatus() {
        System.out.println("ID Kategori\t= " + idCategory);
        System.out.println("Nama Kategori\t= " + nameCategory);
        System.out.println("Product\t\t= ");
        for (int i = 0; i < productAmount; i++) {
            System.out.println((i + 1) + ". " + products[i].getNameProduct());
            products[i].printStatus();
        }
        System.out.println("Stok Kategori " + nameCategory + ": " + getCategoryStock());
        System.out.println("\n");
    }

}
