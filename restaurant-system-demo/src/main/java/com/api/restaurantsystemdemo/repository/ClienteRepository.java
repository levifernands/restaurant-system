package com.api.restaurantsystemdemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restaurantsystemdemo.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
//	Cliente findByEmail(String email);
	Optional<Cliente> findById(Long id);
}
