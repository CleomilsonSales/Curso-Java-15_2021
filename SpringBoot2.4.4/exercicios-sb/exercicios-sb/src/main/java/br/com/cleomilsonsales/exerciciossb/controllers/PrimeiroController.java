package br.com.cleomilsonsales.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	//@RequestMapping (method = RequestMethod.GET, path = "/ola") //requisição 
	@GetMapping(path = {"/ola","/saudacao"}) //tranformando diretamente em um get
	public String ola() {
		return "Ola Spring Boot";
	}
}
