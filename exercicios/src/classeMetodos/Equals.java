package classeMetodos;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 =  new Usuario();
		u1.nome = "Cleomilson Sales";
		u1.email = "cleomilsonsales@hotmail.com";
		
		Usuario u2 =  new Usuario();
		u2.nome = "Cleomilson Sales";
		u2.email = "cleomilsonsales@hotmail.com";
		
		//nesse caso e falso pq a comparação esta no endereço de memoria do objeto
		System.out.println(u1 == u2);
		//comparando o conteudo dos objetos com base no metodo equals
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
	
}
