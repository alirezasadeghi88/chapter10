package model;

public class Customer {
    private String name;
    private Product[] purchasedProducts;
    private int productCount;

    public Customer(String name, int maxProducts) {
        this.name = name;
        this.purchasedProducts = new Product[maxProducts];
        this.productCount = 0;
    }

    public void buyProduct(Product p) {
        if (productCount < purchasedProducts.length) {
            purchasedProducts[productCount++] = p;
            p.addBuyer(this);
        }
    }

    public String getName() {
        return name;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }
}
