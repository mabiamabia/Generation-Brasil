package com.game.gengame.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.game.gengame.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);

}
