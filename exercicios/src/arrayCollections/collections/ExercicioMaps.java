package arrayCollections.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExercicioMaps {
	
	public static void main(String[] args) {
		Map<Integer,String> usuarios = new HashMap<>();
		
		//put -> adiciona e altera informações adicionadas no mapa
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo");
		usuarios.put(2, "Maria");
		usuarios.put(3, "Antonio");
		usuarios.put(4, "Paulo");
		
		//Lista as chaves do map
		System.out.println(usuarios.keySet());
		
		//lista os valores
		System.out.println(usuarios.values());
		
		//lista chaves e valores
		System.out.println(usuarios.entrySet());
		
		//pode usar o keySet, Values e entrySet para percorre com um foreach
		for (int chave:usuarios.keySet()) {
			System.out.println(chave);
		}
		for (String valor:usuarios.values()) {
			System.out.println(valor);
		}
		//Entry tem que ser o do util.map
		for (Entry<Integer, String> registro:usuarios.entrySet()) {
			System.out.print(registro.getKey()+"->");
			System.out.println(registro.getValue());
		}
		
		//Verificando se existe o elemento
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Maria"));
		
		//pegando item do mapa
		System.out.println(usuarios.get(4));
		
		
		
		
		
	}

}
