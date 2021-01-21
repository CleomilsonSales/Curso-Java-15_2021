package arrayCollections.collections;

import java.util.ArrayList;

public class ExerciciosList {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Marta"));
		
		//acessando pelo indice
		System.out.println(lista.get(3));
		
		//removendo da lista
		lista.remove(1);
		//ou
		lista.remove(new Usuario("Pedro"));
		
		//contem
		System.out.println("Tem? "+lista.contains(new Usuario("Lia")));
		
		
		for(Usuario u:lista) {
			System.out.println(u.nome);
		}
		
		
	}

}
