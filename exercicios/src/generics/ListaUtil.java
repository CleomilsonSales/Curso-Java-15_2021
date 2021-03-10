package generics;

import java.util.List;

public class ListaUtil {
	//precisa usar cast
	public static Object getUltimo1(List<?> lista) {
		//pegando ultimo registro de uma lista
		return lista.get(lista.size() - 1);
	}
	
	//precisa usar cast por causa do cast
	public static <T> T getUltimo2(List<T> lista) {
		//pegando ultimo registro de uma lista
		return lista.get(lista.size() - 1);
	}
}	
