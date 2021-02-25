package excecao;

import Streams.Alunos;

public class Causa {
	public static void main(String[] args) {
		//exceção causada por outra exceção
		
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
			//aqui eu trato a exceção como deveria ser, não alterando a origem
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Alunos aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno está null!");
		}
		
		System.out.println(aluno.getNome());
	}
}
