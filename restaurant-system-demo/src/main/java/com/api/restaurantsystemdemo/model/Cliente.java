package com.api.restaurantsystemdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_clientes")
@Data
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "name", length = 100)
	private String name;
	
//	@Column(name = "email", length = 100, nullable = false)
//	private String email;
	
}
