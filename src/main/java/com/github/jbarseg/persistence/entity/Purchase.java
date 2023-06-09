package com.github.jbarseg.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private int idPurchase;
    @Column(name = "id_cliente")
    private String idClient;
    @Column(name = "fecha")
    private LocalDateTime date;
    @Column(name = "medio_pago")
    private String paymentMethod;
    @Column(name = "comentario")
    private String comment;
    @Column(name = "estado")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Client client;

    @OneToMany(mappedBy = "purchase", cascade = {CascadeType.ALL})
    private List<ProductPurchase> products;

    

    public int getIdPurchase() {
        return idPurchase;
    }



    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }


    public String getIdClient() {
        return idClient;
    }



    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }



    public LocalDateTime getDate() {
        return date;
    }



    public void setDate(LocalDateTime date) {
        this.date = date;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Client getClient() {
        return client;
    }



    public void setClient(Client client) {
        this.client = client;
    }



    public List<ProductPurchase> getProducts() {
        return products;
    }



    public void setProducts(List<ProductPurchase> products) {
        this.products = products;
    }



    @Override
    public String toString() {
        return "Compra [idPurchase=" + idPurchase + ", idClient=" + idClient + ", date=" + date + ", paymentMethod="
                + paymentMethod + ", comment=" + comment + ", status=" + status + "]";
    }



}
