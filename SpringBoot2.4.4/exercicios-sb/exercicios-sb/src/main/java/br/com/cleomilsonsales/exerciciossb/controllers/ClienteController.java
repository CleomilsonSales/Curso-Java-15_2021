package br.com.cleomilsonsales.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleomilsonsales.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28,"Pedro", "123.456.789-10");
	}
}
