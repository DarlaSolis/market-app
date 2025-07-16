package com.tecdesoftware.market.domain;

import java.time.LocalDate;
import java.util.List;


public class Purchase {
    private String clientId;
    private LocalDate purchaseDate;
    private String paymentMethod;
    private String comment;
    //Estado del producto(disponible, etc)
    private String state;
    private List<PurchaseItem> items;
    private int purchaseId;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<PurchaseItem> getItems() {
        return items;
    }

    public void setItems(List<PurchaseItem> items) {
        this.items = items;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }
}
