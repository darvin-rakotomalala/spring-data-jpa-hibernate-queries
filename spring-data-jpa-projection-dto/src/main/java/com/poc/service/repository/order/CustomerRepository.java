package com.poc.service.repository.order;

import com.poc.donnee.domain.Customer;
import com.poc.donnee.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT new com.poc.donnee.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
