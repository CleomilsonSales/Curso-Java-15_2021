package oo.heranca.desafio;

public class Carro {
	
	int velocidadeAtual;
	String nomeCarro;
	
	Carro(String nomeCarro){
		this.nomeCarro = nomeCarro;
	}
	
	void acelerar() {
		velocidadeAtual += 5;
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual do(a) " + nomeCarro + " é " + velocidadeAtual + "Km/h";
	}
}
