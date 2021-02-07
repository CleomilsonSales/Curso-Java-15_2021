package oo.heranca.desafio.testes;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		Carro civic = new Civic("Civic");
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		Ferrari ferrari = new Ferrari("Ferrari",140);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligaTurbo();
		ferrari.acelerar();
		ferrari.ligarAr();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.velocidadeDoAr();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.frear();
		System.out.println(ferrari);
	}
}
