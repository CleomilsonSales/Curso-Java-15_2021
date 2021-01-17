package arrayCollections.array;

import java.util.Arrays;

public class ExerciciosArray {
	
	public static void main(String[] args) {
		
		//Array é um objeto, tem varios metodos para facilitar
		
		double [] notasAlunoA = new double [3];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		//listar o array
		System.out.println(Arrays.toString(notasAlunoA));
		
		//usando o array
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA = notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		System.out.println(notasAlunoA[0]);
		
		//iniciando array
		//array pode ter um variavel dentro
		final double notaArmazenada = 5.0;
		double [] notasAlunoB = { 6.8, 9.8, notaArmazenada,4.9 };
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}

}
