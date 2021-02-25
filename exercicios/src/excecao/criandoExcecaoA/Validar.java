package excecao.criandoExcecaoA;

import Streams.Alunos;

public class Validar {
	//construtor privado para que a classe n�o posso ser instanciada
	private Validar() {}
	
	public static void aluno(Alunos aluno) {
		if (aluno == null) {
			throw new IllegalArgumentException("Aluno est� nulo!");
		}
		
		if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("Nome");
		}
		
		if (aluno.getNota() < 0 || aluno.getNota() > 10) {
			throw new NumeroForaIntervaloException("Nota");
		}
	}
}
