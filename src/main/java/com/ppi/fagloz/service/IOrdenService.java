package com.ppi.fagloz.service;

import java.util.List;

import com.ppi.fagloz.model.Orden;
import com.ppi.fagloz.model.Usuario;

public interface IOrdenService {
	
	List<Orden> findAll();
	
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
	
}
