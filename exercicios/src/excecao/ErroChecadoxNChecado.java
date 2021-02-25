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
			//Throwable a forma mais generica de tratar erro, informa que qualquer tipo de erro ou exce��o sera tratada
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	//n�o checada ou n�o verificada, ou seja o complicador n�o ira avisar
	static void gerarErro1() {
		//throw lan�a (dispara) um erro
		//excecoes do tipo runtime e excecoes que herdam dela o java n�o obriga a ser tratada � opnicional
		throw new RuntimeException("Erro #01");
	}
	
	//checada o compilar n�o deixar complilar, para complicar preciso colocar um Throws na assinatura do metodo
	//throws informa para o java que era tratato o erro por quem esta chamando, nesse caso o MAIN
	static void gerarErro2() throws Exception{
		throw new Exception("Erro #02");
	}
}
