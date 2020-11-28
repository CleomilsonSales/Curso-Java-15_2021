package controles;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		int media = entrada.nextInt();

		boolean mediaInvalida = media > 10 || media < 0;
		
		if (mediaInvalida) {
			System.out.println("Média invalida!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media >= 5) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}

		entrada.close();

	}

}
