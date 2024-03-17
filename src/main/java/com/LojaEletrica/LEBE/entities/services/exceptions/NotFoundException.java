package com.LojaEletrica.LEBE.entities.services.exceptions;

public class NotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public NotFoundException(Object id) {
		super("Essa identificação esta errada ou não existe  " + id);
	}

}
