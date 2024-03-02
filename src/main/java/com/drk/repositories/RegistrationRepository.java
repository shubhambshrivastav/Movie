package com.drk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drk.entities.User;

public interface RegistrationRepository extends JpaRepository<User, Integer> {

	User findByName(String username);

}
