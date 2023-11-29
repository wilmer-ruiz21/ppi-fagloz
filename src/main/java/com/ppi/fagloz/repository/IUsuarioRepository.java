package com.ppi.fagloz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ppi.fagloz.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

}
