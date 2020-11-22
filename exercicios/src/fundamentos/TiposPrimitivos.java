package fundamentos;

public class TiposPrimitivos {
	  
	public static void main(String[] args) {
		//tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numeroVoos = 542;
		int id = 56789;
		// L no final do numero é um literal long - ou seja ele permiti passar do tamanho (range) permitio na variavel long
		// _ so pra mostrar as casas decimais não vai influenciar no valor da variaveis na visual sera disconsiderado o _
		long pontosAcumulados = 3_134_845_223L;
		
		System.out.println(pontosAcumulados);
		
		
		//tipos numeros reis (Flutuante)
		//F no final é um literal float
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false;
		
		//tipo caracteres
		// \u0010 indica que é um numero dentro da tabela unicode
		char status = 'A';
		char status2 = '\u0010';
		
		System.out.println(status2);
		
		//dias de empresa
		System.out.println("Dias de empresa: " + (anosDeEmpresa * 365));
		
		//numero de viagens
		System.out.println(numeroVoos / 2);
		
		//pontos real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//id
		System.out.println(id + " ganha -> " + salario);
		System.out.println("Férias? "+estaDeFerias);
		System.out.println("Status: " + status);
	}

}
