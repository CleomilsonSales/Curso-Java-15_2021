package excecao;

import Streams.Alunos;

public class Causa {
	public static void main(String[] args) {
		//exce��o causada por outra exce��o
		
		try {
			metodoA(new Alunos("Ana", 7));
			//erro
			//metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}
	
	static void metodoA(Alunos aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			//aqui eu trato a exce��o como deveria ser, n�o alterando a origem
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Alunos aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno est� null!");
		}
		
		System.out.println(aluno.getNome());
	}
}
