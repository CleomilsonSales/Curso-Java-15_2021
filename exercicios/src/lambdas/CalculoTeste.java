package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		//lambda function são metodos dentro de uma variavel usa o "->"
		
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.outroMetodo());
		System.out.println(Calculo.outroMetodo2());
	}
}
