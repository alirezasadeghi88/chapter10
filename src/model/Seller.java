package model;

public class Seller {
    private String name;
    private Product[]offeredProducts;
    private int productCount;

    public Seller(String name, int maxProducts) {
        this.name = name;
        this.offeredProducts = new Product[maxProducts];
        this.productCount = 0;
    }

    public void OfferProducts(Product p) {
        if (productCount < offeredProducts.length) {
            offeredProducts[productCount++] = p;
            p.setSeller(this);
        }
    }

    public String getName() {
        return name;
    }

    public Product[] getOfferedProducts() {
        return offeredProducts;
    }
}
