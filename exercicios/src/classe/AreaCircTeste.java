package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		//chamando com instancia
		AreaCirc a1 = new AreaCirc(10);
		System.out.println(a1.area());
		
		//chando o metodo diretamente a classe
		System.out.println(AreaCirc.area(100));
		
		System.out.println(AreaCirc.PI);
				
		
		
	}

}
