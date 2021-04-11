package br.com.cleomilsonsales.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleomilsonsales.exerciciossb.models.entities.Cliente;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28,"Pedro", "123.456.789-10");
	}
	
	@GetMapping("/{id}") //dessa forma fica variavel o valor passado.
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Maria", "123.456.789-00");
	}
	
	@GetMapping() 
	public Cliente obterClientePorId2(
			@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Maria Jose", "987.654.321-01");
	}
	
}
