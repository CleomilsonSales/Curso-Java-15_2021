package classeMetodos;

public class ChamarVariavel {
	
	//valores padrões de variveis de instancia ou estatica (classe)
	//variavel local não tem inicialiação padrão
	//objetos inciam em null
	//constante (FINAL) deve ser iniciada
	/*
	 * byte, short, int, long -> 0
	 * float, double -> 0.0
	 * boolean -> false
	 * char -> '\u0000' inicio da tabela unicode 
	 * */
	
	int a = 3; //Variavel de instancia	
	static int b = 4; //variavel estatica (classe)
	
	ChamarVariavel (){
		//this - como metodo significar que esta chamando um construdor da classe de dentro de outros construtor da classe
		//o que defini qual metodo chamar, sera pela variaveis informadas
		this(1);
	}
	
	ChamarVariavel (int a){
		//this - para referencia o objeto criado na instancia.
		//muito usado pra tratar problema de variaveis como o mesmo nome
		this.a = a;
	}
	
	public static void main(String[] args) {
		//para acessar uma variavel de instancia em um metodo estatico, deve instanciar o objeto
		//que esta esteja dentro dele mesmo
		ChamarVariavel p = new ChamarVariavel();
		//acessa a variavel pelo Objeto criado
		System.out.println(p.a);
				
		//variavel statica pode acessar a qualquer momento
		System.out.println(b);
	}

}
