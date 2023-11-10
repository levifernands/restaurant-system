package com.api.restaurantsystemdemo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.api.restaurantsystemdemo.dto.ItemCardapioDTO;
import com.api.restaurantsystemdemo.exception.CommonsException;
import com.api.restaurantsystemdemo.converter.DozerConverter;
import com.api.restaurantsystemdemo.model.ItemCardapio;
import com.api.restaurantsystemdemo.repository.ItemCardapioRepository;

@Service
public class ItemCardapioService {
	
	@Autowired
	private ItemCardapioRepository repository;

	public ItemCardapioDTO save(ItemCardapioDTO dto) {
		
		var itemCardapio = DozerConverter.parseObject(dto, ItemCardapio.class);
		var itemCardapioDTOSaved = DozerConverter.parseObject(repository.save(itemCardapio), ItemCardapioDTO.class);
		
		return itemCardapioDTOSaved;
	} 
	

}
