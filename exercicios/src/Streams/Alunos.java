package Streams;

public class Alunos {
	final String nome;
	final double nota;
	final boolean bomComportamento;
	
	public Alunos(String nome, double nota) {
		//dessa forma o bomComportamento será sempre verdadeiro
		this(nome, nota, true);
	}
	
	public Alunos(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	
}
