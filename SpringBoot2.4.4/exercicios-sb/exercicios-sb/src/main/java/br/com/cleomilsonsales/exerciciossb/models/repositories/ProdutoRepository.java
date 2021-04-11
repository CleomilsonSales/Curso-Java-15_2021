package br.com.cleomilsonsales.exerciciossb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.cleomilsonsales.exerciciossb.models.entities.Produto;

public interface ProdutoRepository 
	extends CrudRepository<Produto, Integer> {
	//responsavel pela persistencia
	
	
	
}
