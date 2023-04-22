package org.example.model;

public class ProductModel {

    private Character productName;
    private Double price;
    private Integer promotionalCount;
    private Double promotionalPrice;

    public ProductModel(Character productName, Double price, Integer promotionalCount, Double promotionalPrice) {
        this.productName = productName;
        this.price = price;
        this.promotionalCount = promotionalCount;
        this.promotionalPrice = promotionalPrice;
    }

    public ProductModel() {
    }

    public char getProductName() {
        return productName;
    }

    public void setProductName(Character character) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPromotionalCount() {
        return promotionalCount;
    }

    public void setPromotionalCount(Integer promotionalCount) {
        this.promotionalCount = promotionalCount;
    }

    public Double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(Double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", promotionalCount=" + promotionalCount +
                ", promotionalPrice=" + promotionalPrice +
                '}';
    }
}
