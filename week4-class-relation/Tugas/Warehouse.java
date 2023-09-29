package Tugas;

public class Warehouse {
    private Category[] categories;
    private int categoriesAmount;

    Warehouse() {
    }

    Warehouse(Category[] categories) {
        this.categories = categories;
        this.categoriesAmount = this.categories.length;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Category[] getCategories() {
        return categories;
    }

    public int getCategoriesAmount() {
        return categoriesAmount;
    }

    public int getCategoryStock() {
        int stockTemp = 0;
        for (int i = 0; i < categoriesAmount; i++) {
            for (int y = 0; y < categories[i].getProductAmount(); y++) {
                stockTemp += categories[i].getProducts()[y].getQty();
            }
        }
        return stockTemp;
    }

    public void addStock(String productId, int stock) {
        for (int i = 0; i < categoriesAmount; i++) {
            for (int y = 0; y < categories[i].getProductAmount(); y++) {
                if (categories[i].getProducts()[y].getIdProduct() == productId) {
                    categories[i].addStock(productId, stock);
                }
            }
        }
    }

    public void reduceStock(String productId, int stock) {
        for (int i = 0; i < categoriesAmount; i++) {
            for (int y = 0; y < categories[i].getProductAmount(); y++) {
                if (categories[i].getProducts()[y].getIdProduct() == productId) {
                    categories[i].reduceStock(productId, stock);
                }
            }
        }
    }

    public int getWarehouseStock() {
        int qty = 0;
        for (int i = 0; i < categoriesAmount; i++) {
            for (int y = 0; y < categories[i].getProductAmount(); i++) {
                qty += categories[i].getProducts()[y].getQty();
            }
        }
        return qty;
    }

    public void printStatus() {
        System.out.println(">>>> Jumlah Stok = " + getCategoryStock() + " <<<<");
        System.out.println("Product Di Gudang: ");
        for (int i = 0; i < categoriesAmount; i++) {
            categories[i].printStatus();
        }
    }

}
