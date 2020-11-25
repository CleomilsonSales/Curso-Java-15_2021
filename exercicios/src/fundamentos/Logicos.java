package fundamentos;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		//e
		System.out.println(condicao1 && condicao2);
		//e
		System.out.println(condicao1 && !condicao2);
		//ou
		System.out.println(condicao1 || condicao2);
		//xor - ou exclusivo
		System.out.println(condicao1 ^ condicao2);
		//negação
		System.out.println(!condicao1);
				
				
		// \" escape - usado para mostrar " dentro de um string
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comproTV50 = trabalho1 && trabalho2;
		System.out.println("Compro TV 50\"? " + comproTV50);
		
		
		
	}

}
