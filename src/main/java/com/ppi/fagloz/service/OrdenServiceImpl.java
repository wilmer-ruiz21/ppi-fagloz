package com.ppi.fagloz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppi.fagloz.model.Orden;
import com.ppi.fagloz.repository.IOrdenRepository;

@Service
public class OrdenServiceImpl implements IOrdenService{
	
	@Autowired
	private IOrdenRepository ordenRepository;

	@Override
	public Orden save(Orden orden) {
		
		return ordenRepository.save(orden);
	}

}
