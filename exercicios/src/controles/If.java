package controles;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a m�dia: ");
		int media = entrada.nextInt();

		boolean mediaInvalida = media > 10 || media < 0;
		
		if (mediaInvalida) {
			System.out.println("M�dia invalida!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media >= 5) {
			System.out.println("Recupera��o!");
		} else {
			System.out.println("Reprovado!");
		}

		entrada.close();

	}

}
