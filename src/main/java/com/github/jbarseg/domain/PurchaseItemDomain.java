package com.github.jbarseg.domain;

public class PurchaseItemDomain {
    private int productId;
    private int stock;
    private double totalCost;
    private boolean itemStatus;

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public boolean isItemStatus() {
        return itemStatus;
    }
    public void setItemStatus(boolean itemStatus) {
        this.itemStatus = itemStatus;
    }
}
