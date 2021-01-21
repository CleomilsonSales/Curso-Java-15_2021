package fundamentos;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //é o mesmo que c = c + b
		c -= b; //é o mesmo que c = c - b
		c *= b; //é o mesmo que c = c * b
		c /= b; //é o mesmo que c = c / b
		c %= 2; //é o mesmo que c = c % 2 -  retornara 0 para par e 1 para impa
		
		//operadores unarios
		c++; //incrementa no c seria mesmo que c = c + 1
		
		System.out.println(c);
		int x = 1;
		int y = 2;
		
		System.out.println(++x == y--);
		System.out.println(x == y);
		

		x++; //analisa a variavel depois incrementa
		y--; //analisa a variavel depois descrementa
		
		++x; //incrementa a variavel depois analisa
		--y; //decrementa a variavel depois analisa
		
		
		//operadores ternario
		double media = 8.6;
		String resultadoParcial = media >= 5.0 ?
				"em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ?
				"aprovado" : resultadoParcial;
					
		System.out.printf("O aluno esta %s", resultadoFinal);
		
		
			
	}
	
}
