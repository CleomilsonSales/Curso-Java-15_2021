package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox temp = new VBox();
		/*temp.getChildren().add(new Caixa().comTexto("1"));
		temp.getChildren().add(new Caixa().comTexto("2"));
		temp.getChildren().add(new Caixa().comTexto("3"));
		temp.getChildren().add(new Caixa().comTexto("4"));
		temp.getChildren().add(new Caixa().comTexto("5"));
		temp.getChildren().add(new Caixa().comTexto("6"));
		temp.getChildren().add(new Caixa().comTexto("7"));*/
		
		
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		
		Parent cenas;
		cenas = temp;
		cenas = new TesteAnchorPane();
		cenas = new TesteBorderPane();
		cenas = new TesteFlowPane();
		cenas = new TesteGridPane();
		//cenas = new TesteStackPane(); //comentei por causa da thread
		cenas = new TesteTilePane();
		
		Scene principal = new Scene(cenas, 800, 600);
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
