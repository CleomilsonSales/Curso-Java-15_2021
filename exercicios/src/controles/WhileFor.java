package controles;

import java.util.Scanner;

public class WhileFor {

	public static void main(String[] args) {
		int contador = 0;
		
		//while deteminado
		System.out.println("While deteminado");
		while (contador <= 20) {
			System.out.printf("valor = %d\n", contador);
			contador +=2;
		}
		
		//for
		System.out.println("Com For");
		for (int contador2 = 0; contador2 <= 20; contador2++) {
			System.out.printf("valor = %d\n", contador2);
		}
		
		//While indeterminado
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		//escrever qualquer coisa, e só para ao escrever sair
		while(!valor.equalsIgnoreCase("sair")){
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
		}
		
		//DoWhile
		
		Scanner entrada2 = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Diga as palavras mágica: ");
			System.out.print("Quer sair: ");
			texto = entrada2.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Saiu!");
		
		entrada.close();
		entrada2.close();
		
		
		//for sem numeros
		for (String v = "#"; !v.equals("#####"); v+="#") {
			System.out.println(v);
		}
		
		
		
	}
	
}
