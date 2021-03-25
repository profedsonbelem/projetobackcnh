package br.com.arq.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arq.entity.UploadImagem;


@Repository
public interface UploadImagemRepository extends JpaRepository<UploadImagem, Long> {
	 public UploadImagem  findByName (String name); 
}
 