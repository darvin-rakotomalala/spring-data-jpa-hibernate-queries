package com.poc.donnee.dto;

import com.poc.donnee.domain.Customer;

public class OrderRequest {
    private Customer customer;

    public OrderRequest() {

    }

    public OrderRequest(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                '}';
    }
}
