package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Nome: %s %s \nIdade: %d anos", nome, sobrenome, idade);
		
		entrada.close();
	}

}
