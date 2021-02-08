package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
	public static void main(String[] args) {
		//lambda function são metodos dentro de uma variavel usa o "->"
		
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.apply(2.0, 3.2));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.5, 3.7));

	}
}
