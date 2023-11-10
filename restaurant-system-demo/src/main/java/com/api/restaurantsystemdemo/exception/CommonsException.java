package com.api.restaurantsystemdemo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.api.restaurantsystemdemo.dto.MessageDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Builder
@AllArgsConstructor
@Data
public class CommonsException extends RuntimeException {
	private static final long serialVersionUID = -4694258578216919456L;
	private HttpStatus status;
	private String key;
	private String text;
	
	public CommonsException(HttpStatus status, String text) {
        this.status = status;
        this.text = text;
    }
	


	public ResponseEntity<MessageDTO> getMessageError() {
		MessageDTO messageDTO = new MessageDTO(text, key);
		return ResponseEntity.status(status).body(messageDTO);
	}
}
