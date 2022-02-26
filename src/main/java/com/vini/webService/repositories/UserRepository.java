package com.vini.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vini.webService.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
