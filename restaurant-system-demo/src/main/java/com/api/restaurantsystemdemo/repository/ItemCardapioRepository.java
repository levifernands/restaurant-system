package com.api.restaurantsystemdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restaurantsystemdemo.model.ItemCardapio;

@Repository
public interface ItemCardapioRepository extends JpaRepository<ItemCardapio, Long> {

}