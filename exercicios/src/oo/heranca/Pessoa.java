package oo.heranca;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	//Getters/Setters
	//Getter
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		//Math.abs - negativo para positivo 
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Eu sou o "+getNome()+" e tenho " +getIdade()+ " anos!";
	}
}
