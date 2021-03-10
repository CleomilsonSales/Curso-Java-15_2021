package generics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Rita");
		resultadoConcurso.adicionar(2, "Saori");
		resultadoConcurso.adicionar(3, "Maria");
		resultadoConcurso.adicionar(4, "Antonio");
		resultadoConcurso.adicionar(5, "Jose");
		resultadoConcurso.adicionar(2, "Carlos");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
	}
}
