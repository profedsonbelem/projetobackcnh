package br.com.arq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arq.entity.ClienteGeral; 

@Repository
public interface ClienteGeralRepository extends JpaRepository<ClienteGeral, Long> { 

}
