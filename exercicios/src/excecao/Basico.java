package excecao;
import Streams.Alunos;

public class Basico {
	public static void main(String[] args) {
		Alunos a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		}catch (Exception e) {
			System.out.println("Erro do NullPointer");
		}
		
		try {
			System.out.println(7 / 0);
		}catch (ArithmeticException e) {
			System.out.println("Erro de divisão. Causa: " + e.getMessage());
		}
		
		System.out.println("Fim ;)");
	}
	
	public static void imprimirNomeDoAluno(Alunos aluno) {
		System.out.println(aluno.getNome());
	}
}
