package excecao.criandoExcecaoA;

import Streams.Alunos;

public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Alunos aluno =  new Alunos("", -7);
			//Alunos aluno =  new Alunos("Ana", -7);
			Validar.aluno(aluno);
			Validar.aluno(null);
			//quando as exceções tem o mesmo tratamento pode ser usado o "|"
		} catch (StringVaziaException | 
				NumeroForaIntervaloException |
				IllegalArgumentException e) {
			System.out.println(e.getMessage()); 
		} 
		
		System.out.println("Fim :)");
	}
}
