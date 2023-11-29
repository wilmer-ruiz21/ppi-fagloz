package com.ppi.fagloz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ppi.fagloz.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer>{

}
