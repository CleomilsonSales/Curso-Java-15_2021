package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle{

	private static int i = 0;
	
	private String[] cores = {
			"#c33c5e", "#39aac6", "#28d79a",
			"#fb750e", "#6657a8", "#f9060e"
	};
	
	public Quadrado() {
		this(100);
	}
	
	public Quadrado(int tamanho) {
		
		setWidth(tamanho);
		setHeight(tamanho);

		if (i > 5) i = 0;

		setFill(Color.web(cores[i++]));
		
	}
	
}
