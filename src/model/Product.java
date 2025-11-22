package model;

public class Product {
    private String title;
    private Customer[]buyers;
    private int buyCount;
    private Seller seller;

    public Product(String name, int maxBuyers) {
        this.title = title;
        this.buyers = new Customer[maxBuyers];
        this.buyCount = 0;
    }

    public void addBuyer(Customer c) {
        if (buyCount < buyers.length) {
            buyers[buyCount++] = c;
        }
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getTitle() {
        return title;
    }

    public Customer[] getBuyers() {
        return buyers;
    }

    public Seller getSeller() {
        return seller;
    }
}
