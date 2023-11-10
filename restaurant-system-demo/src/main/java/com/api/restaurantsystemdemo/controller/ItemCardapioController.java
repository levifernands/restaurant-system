package com.api.restaurantsystemdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.restaurantsystemdemo.dto.ItemCardapioDTO;
import com.api.restaurantsystemdemo.service.ItemCardapioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/item")
public class ItemCardapioController {
	@Autowired	
	private ItemCardapioService service;
	
	@Operation(summary = "Cadastra os dados de um item presente no cardápio", tags = "ItemCardapio")
	@PostMapping
	public ItemCardapioDTO create(@RequestBody ItemCardapioDTO itemCardapio) {
		return service.save(itemCardapio);
	}

}
