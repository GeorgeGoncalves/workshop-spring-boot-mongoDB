package com.example.demo.controle.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.servico.exception.ObjetoNaoEncontrado;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ManipuladorErro {

	@ExceptionHandler(ObjetoNaoEncontrado.class)
	public ResponseEntity<ErroPadrao> objetoNaoEncontrado(
			ObjetoNaoEncontrado e, HttpServletRequest request){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		ErroPadrao ePadrao = new ErroPadrao(Instant.now(),
				status.value(), e.getMessage(),
				request.getRequestURI());
		return ResponseEntity.status(status).body(ePadrao);
	}
}
