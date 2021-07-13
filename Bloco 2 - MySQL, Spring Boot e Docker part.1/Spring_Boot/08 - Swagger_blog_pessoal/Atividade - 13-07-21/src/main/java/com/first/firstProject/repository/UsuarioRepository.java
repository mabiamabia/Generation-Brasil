package com.first.firstProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.firstProject.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario);

}
