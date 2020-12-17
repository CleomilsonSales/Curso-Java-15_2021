package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//construtor padr�o
	Produto(){	
	}
	
	Produto(String nomeInicial,
			double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}	
	
	//metodo - quando parametros ja est�o no objeto, n�o precisa passar no metodo para recebe-los, basta chama-los
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	//chamado um parametros que esta fora do objeto
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
