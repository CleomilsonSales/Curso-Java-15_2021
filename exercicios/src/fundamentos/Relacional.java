package fundamentos;

public class Relacional {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a'; //valor inteiro 97 ou hexadecimal \u0061;
		System.out.println('\u0061');
				
		System.out.println(a == b);
		System.out.println(a != b);
		
		double nota = 6.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? "+temDesconto);
	}

}
