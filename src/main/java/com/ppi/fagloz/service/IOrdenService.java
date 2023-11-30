package com.ppi.fagloz.service;

import java.util.List;

import com.ppi.fagloz.model.Orden;

public interface IOrdenService {
	
	List<Orden> findAll();
	
	Orden save (Orden orden);
	String generarNumeroOrden();
}
