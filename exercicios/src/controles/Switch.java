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
			break; //sai do fluxo de repeti��o (Switch, For, While)
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
			conceito = "n�o informando!";
		}
				
		System.out.println("Conceito � "+conceito);
		
		entrada.close();
		
		/*Exemplo de continue
		O break para a repeti��o
		O continue pula aquele momento da repeti��o
		exemplo*/
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; //ir� pular apenas a exibi��o do 5
			}
			System.out.println(i);
		}
		
		
	}
}
