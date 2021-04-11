package br.com.cleomilsonsales.exerciciossb.controllers.desafio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	//chamando pela url: calculadora/somar/primeiro_numero/segundo_numero
	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
	
	//chamando pela url: calculadora/substrair?primeiro_numero&segundo_numero
	//http://localhost:8080/calculadora/substrair?a=100&b=30
	@GetMapping("/subtrair")
	public int subtrair(
			@RequestParam(name = "a") int a, 
			@RequestParam(name = "b") int b) {
		return a - b;
	}
}
