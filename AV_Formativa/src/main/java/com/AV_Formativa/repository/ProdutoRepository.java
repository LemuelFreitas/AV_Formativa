package com.AV_Formativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AV_Formativa.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	// Nenhuma implementação é necessária. Spring Data JPA cuidará disso.
}