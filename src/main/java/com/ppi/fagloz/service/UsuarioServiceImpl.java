package com.ppi.fagloz.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppi.fagloz.model.Usuario;
import com.ppi.fagloz.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public Optional<Usuario> findById(Integer id) {
		
		return usuarioRepository.findById(id);
	}
	
	
	
	

}
