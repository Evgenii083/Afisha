package ru.netology.project;

public class Product {

    private int productId;
    private String productName;
    private int id;

    public Product(int productId, String productName, int id) {
        this.productId = productId;
        this.productName = productName;
        this.id = id;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getId() {
        return id;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
