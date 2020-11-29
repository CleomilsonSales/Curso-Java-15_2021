package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	//metodo - quando parametros ja est�o no objeto, n�o precisa passar no metodo para recebe-los, basta chama-los
	double precoComDesconto() {
		return preco * (1- desconto);
	}
	
	//chamado um parametros que esta fora do objeto
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1- desconto + descontoDoGerente);
	}
}
