package com.example.supermarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int pid;
    private String pname;
    private String pcategory;
    private int pquantity;
    private int pprice;
    
    public Product() {
    }

    public Product(int pid, String pname,String pcategory, int pquantity, int pprice) {
        this.pid = pid;
        this.pname = pname;
        this.pcategory = pcategory;
        this.pquantity = pquantity;
        this.pprice = pprice;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcategory() {
        return pcategory;
    }

    public void setPcategory(String pcategory) {
        this.pcategory = pcategory;
    }

    public int getPquantity() {
        return pquantity;
    }

    public void setPquantity(int pquantity) {
        this.pquantity = pquantity;
    }

    public int getPprice() {
        return pprice;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

}
