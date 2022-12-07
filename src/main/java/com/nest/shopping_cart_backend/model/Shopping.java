package com.nest.shopping_cart_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userreg")
public class Shopping {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String ph;
    private String email;
    private String psw;
    private String cpsw;


    public Shopping() {
    }

    public Shopping(int id, String name, String address, String ph, String email, String psw, String cpsw) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ph = ph;
        this.email = email;
        this.psw = psw;
        this.cpsw = cpsw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getCpsw() {
        return cpsw;
    }

    public void setCpsw(String cpsw) {
        this.cpsw = cpsw;
    }
}
