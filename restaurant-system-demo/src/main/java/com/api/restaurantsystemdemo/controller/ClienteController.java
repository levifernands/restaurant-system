package com.api.restaurantsystemdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.restaurantsystemdemo.dto.ClienteDTO;
import com.api.restaurantsystemdemo.service.ClienteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired	
	private ClienteService service;
	
	@Operation(summary = "Cadastra os dados de um cliente", tags = "Cliente")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ClienteDTO create(@RequestBody ClienteDTO cliente) {
		return service.save(cliente);
	}
	
//	@Operation(summary = "Edita os dados de um cliente", tags = "Cliente")
//	@PutMapping
//	public ClienteDTO update(@RequestBody ClienteDTO cliente) {
//		return service.save(cliente);
//	}
//	
//	@Operation(summary = "Retorna os dados de um cliente a partir do ID", tags = "Cliente")
//	@ApiResponses({ 
//		@ApiResponse(responseCode = "200", description = "Cliente retornado com sucesso"),
//		@ApiResponse(responseCode = "404", description = "Cliente não encontrado"),
//		@ApiResponse(responseCode = "500", description = "Erro interno no servidor - com.api.restaurantsystemdemo.service.cliente.notfound.exception") })
//	
//	@GetMapping("/{id}")
//	public ClienteDTO findById(@PathVariable("id") Long id) {
//		return service.findById(id);
//	}
//	
//	@Operation(summary = "Deleta um cliente", tags = "Cliente")
//	@DeleteMapping("/{id}")
//	public void delete(@PathVariable("id") Long id) {
//		service.delete(id);
//	}
	

}
