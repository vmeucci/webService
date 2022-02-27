package com.vini.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vini.webService.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
