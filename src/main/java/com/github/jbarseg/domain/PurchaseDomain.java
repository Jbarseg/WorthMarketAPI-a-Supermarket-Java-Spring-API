package com.github.jbarseg.domain;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseDomain {
    private int purchaseId;
    private String clientId;
    private LocalDateTime purchaseDateTime;
    private String purchasePaymentMethod;
    private String purchaseComment;
    private String purchaseStatus;
    private List<PurchaseItemDomain> purchaseItems;
    
    public int getPurchaseId() {
        return purchaseId;
    }
    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public LocalDateTime getPurchaseDateTime() {
        return purchaseDateTime;
    }
    public void setPurchaseDateTime(LocalDateTime purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
    }
    public String getPurchasePaymentMethod() {
        return purchasePaymentMethod;
    }
    public void setPurchasePaymentMethod(String purchasePaymentMethod) {
        this.purchasePaymentMethod = purchasePaymentMethod;
    }
    public String getPurchaseComment() {
        return purchaseComment;
    }
    public void setPurchaseComment(String purchaseComment) {
        this.purchaseComment = purchaseComment;
    }
    public String getPurchaseStatus() {
        return purchaseStatus;
    }
    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }
    public List<PurchaseItemDomain> getPurchaseItems() {
        return purchaseItems;
    }
    public void setPurchaseItems(List<PurchaseItemDomain> purchaseItems) {
        this.purchaseItems = purchaseItems;
    }


}
