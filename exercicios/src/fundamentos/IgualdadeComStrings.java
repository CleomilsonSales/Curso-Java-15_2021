package fundamentos;

import java.util.Scanner;

public class IgualdadeComStrings {
	
	public static void main(String[] args) {
		
		
		String s = new String("2");
		Scanner entrada =  new Scanner(System.in);
		
		//next retira os espa�os digitado
		//nextLine mostrar exatamente como foi digitado
		String s2 = entrada.nextLine(); //digitar 2 com espa�os para mostrar melhor o teste
		System.out.println(s == s2);
		System.out.println(s.equals(s2.trim()));
		
		entrada.close();
		
	}

}
