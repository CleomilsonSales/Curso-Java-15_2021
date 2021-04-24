package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane{
	public TesteBorderPane() {
		Caixa c1 =  new Caixa().comTexto("TOPO");
		setTop(c1);
		Caixa c2 =  new Caixa().comTexto("ESQUERDA");
		setLeft(c2);
		Caixa c3 =  new Caixa().comTexto("DIREITA");
		setRight(c3);
		Caixa c4 =  new Caixa().comTexto("FUNDO");
		setBottom(c4);
		Caixa c5 =  new Caixa().comTexto("BASE");
		setCenter(c5);
	}
}
