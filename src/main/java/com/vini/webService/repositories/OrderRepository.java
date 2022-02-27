package com.vini.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vini.webService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
