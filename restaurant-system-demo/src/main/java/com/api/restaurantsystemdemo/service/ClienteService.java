package com.api.restaurantsystemdemo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.api.restaurantsystemdemo.dto.ClienteDTO;
import com.api.restaurantsystemdemo.dto.ClienteLowDTO;
import com.api.restaurantsystemdemo.converter.DozerConverter;
import com.api.restaurantsystemdemo.exception.CommonsException;
import com.api.restaurantsystemdemo.model.Cliente;
import com.api.restaurantsystemdemo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	public ClienteDTO save(ClienteDTO dto) {
		
		var cliente = DozerConverter.parseObject(dto, Cliente.class);
        var clienteDTOSaved = DozerConverter.parseObject(repository.save(cliente), ClienteDTO.class);
        return clienteDTOSaved;
	} 
	
	public void delete(Long id) {
		this.findById(id);
		repository.deleteById(id);
	}
	
	public ClienteDTO findById(Long id) {
		var cliente = repository.findById(id);
		
		return DozerConverter.parseObject(cliente.get(), ClienteDTO.class);
	}
	
	public List<ClienteLowDTO> findAll(){
		return DozerConverter.parseListObjects
				(repository.findAll(), ClienteLowDTO.class);
	}
	

}
