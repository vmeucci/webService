package com.vini.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vini.webService.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
