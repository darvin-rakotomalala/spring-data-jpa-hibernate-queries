package com.poc.donnee.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private int pid;
    private String productName;
    private int qty;
    private Double price;

    public Product() {

    }

    public Product(int pid, String productName, int qty, Double price) {
        this.pid = pid;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", productName='" + productName + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
