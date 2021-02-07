package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	protected String nomeCarro;
	protected int delta = 5;
	
	protected Carro(String nomeCarro, int velocidadeMaxima){
		this.nomeCarro = nomeCarro;
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	//metodo com final não pode ser sobreescrito
	public final String bozinar() {
		return "bi bi";
	}
	
	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += getDelta();
		}
	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public String toString() {
		return "Velocidade atual do(a) " + nomeCarro + " é " + velocidadeAtual + "Km/h";
	}
}
