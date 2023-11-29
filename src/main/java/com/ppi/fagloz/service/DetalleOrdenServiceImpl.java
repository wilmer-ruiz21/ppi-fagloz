package com.ppi.fagloz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppi.fagloz.model.DetalleOrden;
import com.ppi.fagloz.repository.IDetalleOrdenRepository;


@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService {
	
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		
		return detalleOrdenRepository.save(detalleOrden);
	}

}
