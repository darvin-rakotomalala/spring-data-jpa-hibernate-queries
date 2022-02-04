package com.poc.service.metier.order;

import com.poc.donnee.domain.Customer;
import com.poc.donnee.dto.OrderRequest;
import com.poc.donnee.dto.OrderResponse;

import java.util.List;

public interface CustomerSM {
    Customer saveOrder(OrderRequest request);
    List<Customer> findAllOrders();
    List<OrderResponse> getJoinInformation();
}
