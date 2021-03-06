package generics;

public class CaixaInt extends Caixa<Integer> {
	//Dessa forma eu resolvo o tipo generico nesse objeto
	//"CaixaInt<X> extends Caixa<X>" - dessa forma quem instanciar a CaixaInt é responsavel por passar o tipo do objeto
}
