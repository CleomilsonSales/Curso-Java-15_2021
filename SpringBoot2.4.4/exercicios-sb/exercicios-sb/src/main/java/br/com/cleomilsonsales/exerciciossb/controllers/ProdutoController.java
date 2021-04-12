package br.com.cleomilsonsales.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleomilsonsales.exerciciossb.models.entities.Produto;
import br.com.cleomilsonsales.exerciciossb.models.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	//@Transienti - caso a classe não persita no banco
	@Autowired //coloca automaticamente o objeto criado no repositorio - injeção de dependencia --isso so funciona se o spring tiver criada a classe que esta injetando a dependencia
	private ProdutoRepository produtoRepository; 
	
	/*@PostMapping
	public @ResponseBody Produto novoProduto(
			@RequestParam String nome,
			@RequestParam double preco,
			@RequestParam double desconto) {
		Produto produto = new Produto(nome, preco, desconto); 
		produtoRepository.save(produto);
		return produto;
	}*/
	
	/*
	//forma separada de insert e update
	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		//o sprint consegue instanciar um novo objeto apenas lendo os campos passados no post
		produtoRepository.save(produto); //save - inserção ou edição por causa da interface
		return produto;
	}
	
	@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}*/
	
	//uma forma de generalizar o inserir e o update
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
		//o sprint consegue instanciar um novo objeto apenas lendo os campos passados no post
		produtoRepository.save(produto); //save - inserção ou edição por causa da interface
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome){
		//return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		return produtoRepository.searchByNameLike(parteNome);
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdPagina}")
	public Iterable<Produto> obterProdutosPorPaginacao(
			@PathVariable int numeroPagina,
			@PathVariable int qtdPagina){
		qtdPagina = qtdPagina >= 2 ? qtdPagina = 2 : qtdPagina; 
		
		Pageable page = PageRequest.of(numeroPagina, qtdPagina);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutosPorId(@PathVariable int id){
		return produtoRepository.findById(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	
}
