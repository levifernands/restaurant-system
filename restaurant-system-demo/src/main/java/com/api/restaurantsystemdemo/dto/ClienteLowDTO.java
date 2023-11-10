package com.api.restaurantsystemdemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteLowDTO {
	
	@JsonProperty("name")
	private String name;
	

}
