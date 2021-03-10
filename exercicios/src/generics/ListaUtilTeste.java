package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("Java", "JavaScript", "C++", "C#");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		//sem generics preciso do cast
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero);
		
		//com generics não precisa fazer o cast
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		//deixa explicito que deverá ser Integer, pq estou especificando o tipo 
		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(ultimoNumero2);
	}
}
