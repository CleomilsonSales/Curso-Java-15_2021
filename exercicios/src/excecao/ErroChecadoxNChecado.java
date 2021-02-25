package excecao;

public class ErroChecadoxNChecado {
	public static void main(String[] args) {
		try {
			gerarErro1();
		} catch (RuntimeException e1) {
			System.out.println(e1.getMessage());
		}
		
		try {
			gerarErro2();
		} catch (Throwable e) {
			//Throwable a forma mais generica de tratar erro, informa que qualquer tipo de erro ou exceção sera tratada
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	//não checada ou não verificada, ou seja o complicador não ira avisar
	static void gerarErro1() {
		//throw lança (dispara) um erro
		//excecoes do tipo runtime e excecoes que herdam dela o java não obriga a ser tratada é opnicional
		throw new RuntimeException("Erro #01");
	}
	
	//checada o compilar não deixar complilar, para complicar preciso colocar um Throws na assinatura do metodo
	//throws informa para o java que era tratato o erro por quem esta chamando, nesse caso o MAIN
	static void gerarErro2() throws Exception{
		throw new Exception("Erro #02");
	}
}
