package com.game.gengame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.gengame.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAll (String nome);

}
