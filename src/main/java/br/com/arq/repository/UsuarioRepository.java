package br.com.arq.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sun.el.stream.Optional;

import br.com.arq.entity.Usuario;

@Transactional()
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	  public Usuario findByEmailAndPassword(String email, String password);
      public Usuario findByEmail(String email);
      
      
      
}
