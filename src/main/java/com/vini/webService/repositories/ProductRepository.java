package com.vini.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vini.webService.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
