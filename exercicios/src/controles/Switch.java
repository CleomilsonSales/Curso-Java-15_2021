package controles;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break; //sai do fluxo de repetição (Switch, For, While)
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "não informando!";
		}
				
		System.out.println("Conceito é "+conceito);
		
		entrada.close();
		
		/*Exemplo de continue
		O break para a repetição
		O continue pula aquele momento da repetição
		exemplo*/
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; //irá pular apenas a exibição do 5
			}
			System.out.println(i);
		}
		
		
	}
}
