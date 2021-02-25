package excecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		//finally é uma forma de continuar o codigo mesmo depois do catch
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextInt());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Continuar o código!");
			entrada.close();
		}
		
		System.out.println("Fim :)");
	}
}
