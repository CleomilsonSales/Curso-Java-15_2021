package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Oba".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Chico")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
	}

}
