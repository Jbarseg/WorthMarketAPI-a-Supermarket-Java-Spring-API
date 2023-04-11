package com.github.jbarseg.domain;

public class CategoryDomain {
    private int categoryId;
    private String category;
    private boolean categoryStatus;
    
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public boolean isCategoryStatus() {
        return categoryStatus;
    }
    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }
    @Override
    public String toString() {
        return "CategoryDomain [categoryId=" + categoryId + ", category=" + category + ", categoryStatus="
                + categoryStatus + "]";
    }

}
