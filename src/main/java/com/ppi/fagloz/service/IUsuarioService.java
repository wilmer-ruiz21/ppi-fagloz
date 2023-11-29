package com.ppi.fagloz.service;

import java.util.Optional;

import com.ppi.fagloz.model.Usuario;

public interface IUsuarioService {

	Optional<Usuario> findById(Integer id);
	
	
}
