package br.com.cleomilsonsales.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleomilsonsales.exerciciossb.models.entities.Produto;
import br.com.cleomilsonsales.exerciciossb.models.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	@Autowired //coloca automaticamente o objeto criado no repositorio
	private ProdutoRepository produtoRepository; 
	
	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome); 
		produtoRepository.save(produto);
		return produto;
	}
}
