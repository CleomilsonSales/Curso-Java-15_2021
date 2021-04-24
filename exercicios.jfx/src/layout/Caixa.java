package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox{
	
	//static pq ele não esta preso a uma instancia, assim sempre que instancia algo ele vai incrementando, assim não precisa de um random
	private static int i = 0;
	
	private String[] cores = {
			"#c33c5e", "#39aac6", "#28d79a",
			"#fb750e", "#6657a8", "#f9060e"
	};
	
	public Caixa() {
		this(100, 100);
	}
	
	public Caixa(int largura, int altura) {
		setAlignment(Pos.CENTER);
		
		setMinWidth(largura);
		setMinHeight(altura);
		
		//zerando o indice acima das cores que existem
		if (i > 5) i = 0;
		
		//cores[i++] = recebe o indice e ja incrementa
		BackgroundFill fill = new BackgroundFill(
				Color.web(cores[i++]), CornerRadii.EMPTY, Insets.EMPTY);
		setBackground(new Background(fill));
		
	}
	
	public Caixa comTexto(String texto) {
		//retornando o objeto é otimo pq pode encadear contexto sem precisar fazer chamada em outra linha
		Label label = new Label(texto);
		label.setFont(new Font(24));
		getChildren().add(label);
		return this;
	}
}
