package com.ppi.fagloz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ppi.fagloz.model.Orden;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer>{

	
}
