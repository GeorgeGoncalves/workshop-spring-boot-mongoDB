package com.example.demo.servico.exception;

public class ObjetoNaoEncontrado extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjetoNaoEncontrado(String msg) {
		super(msg);
	}
}
