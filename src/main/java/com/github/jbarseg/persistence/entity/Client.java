package com.github.jbarseg.persistence.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Client {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellidos")
    private String lastname;
    @Column(name = "celular")
    private Long phoneNumber;
    @Column(name = "direccion")
    private String location;
    @Column(name = "correo_electronico")
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Purchase> purchases;

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public Long getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public List<Purchase> getPurchases() {
        return purchases;
    }


    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }


    @Override
    public String toString() {
        return "Cliente [id=" + id + ", name=" + name + ", lastname=" + lastname + ", phoneNumber=" + phoneNumber
                + ", location=" + location + ", email=" + email + "]";
    }

}
