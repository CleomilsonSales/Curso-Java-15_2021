package br.com.cleomilsonsales.exerciciossb.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository; //tem tudo do crudRepository mais a opção de busca com paginação
import org.springframework.data.repository.query.Param;

import br.com.cleomilsonsales.exerciciossb.models.entities.Produto;

public interface ProdutoRepository 
	//extends CrudRepository<Produto, Integer> { //forma simples do crud no spring
	extends PagingAndSortingRepository<Produto, Integer> {
	//responsavel pela persistencia
	
	
	/*
	 * algumas conversões para o spring implementar automaticamente:
	 * palavras que contem
	 * findByNomeContaining
	 * findByNomeIsContaining
	 * findByNomeContains
	 * 
	 * palavras que começa ou terminam
	 * findByNomeStartsWith
	 * findByNomeEndsWith
	 * 
	 * palavras que não cotem
	 * findByNomeNotContaining*/
	
	
	//metodo usando conversão, nesse caso não é necessário implentar, o spring irá fazer isso automaticamente
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	//outra forma de procurar palavras no banco, sendo mais especifica com o jpql
	@Query("SELECT p FROM Produto p WHERE p.nome like %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
	
}
