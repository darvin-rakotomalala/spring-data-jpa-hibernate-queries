package com.poc.service.metier.order;

import com.poc.donnee.domain.Customer;
import com.poc.donnee.dto.OrderRequest;
import com.poc.donnee.dto.OrderResponse;
import com.poc.service.repository.order.CustomerRepository;
import com.poc.service.repository.order.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerSMImpl implements CustomerSM {

    private CustomerRepository customerRepository;
    private ProductRepository productRepository;

    public CustomerSMImpl(CustomerRepository customerRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Customer saveOrder(OrderRequest request) {
        return customerRepository.save(request.getCustomer());
    }

    @Override
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }

    @Override
    public List<OrderResponse> getJoinInformation() {
        return customerRepository.getJoinInformation();
    }
}
