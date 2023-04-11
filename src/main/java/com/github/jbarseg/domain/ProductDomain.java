package com.github.jbarseg.domain;

public class ProductDomain {

    private int productId;
    private String productName;
    private int productCategoryId;
    private double productPrice;
    private int productStock;
    private boolean productStatus;
    //In terms of our domain
    private CategoryDomain productCategory;
    
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductCategoryId() {
        return productCategoryId;
    }
    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public int getProductStock() {
        return productStock;
    }
    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
    public boolean isProductStatus() {
        return productStatus;
    }
    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
    public CategoryDomain getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(CategoryDomain productCategory) {
        this.productCategory = productCategory;
    }

    
}