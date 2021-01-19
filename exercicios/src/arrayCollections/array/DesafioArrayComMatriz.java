package arrayCollections.array;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrayComMatriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantidade de alunos: ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("Informe a quantidade de notas: ");
		int qtdeNotas = entrada.nextInt();
		
		//criando a matriz
		double[][] notasTurma = new double [qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
			}
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.printf("A média da turma é %.2f", media);
		System.out.println();
		
		//exibindo as notas digitadas por aluno
		for(double [] notasDoAluno:notasTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
	}
	
}
