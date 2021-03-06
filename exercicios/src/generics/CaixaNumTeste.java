package generics;

public class CaixaNumTeste {
	public static void main(String[] args) {
		CaixaNum<Double> caixaA = new CaixaNum<>();
		caixaA.guardar(2.3);
		System.out.println(caixaA.abrir());
		
		CaixaNum<Integer> caixaB = new CaixaNum<>();
		caixaB.guardar(2);
		System.out.println(caixaB.abrir());
	}
}
