package com.poc.infrastructure;

import com.poc.donnee.domain.Customer;
import com.poc.donnee.dto.OrderRequest;
import com.poc.donnee.dto.OrderResponse;
import com.poc.service.metier.order.CustomerSM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/placeOrder")
public class OrderController {
    @Autowired
    private CustomerSM customerSM;

    @PostMapping
    public Customer saveOrder(@RequestBody OrderRequest request) {
        return customerSM.saveOrder(request);
    }

    @GetMapping
    public List<Customer> findAllOrders() {
        return customerSM.findAllOrders();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation() {
        return customerSM.getJoinInformation();
    }
}
