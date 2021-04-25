module exercicios_jfx {
	requires javafx.controls;
	requires javafx.fxml;
	//biblioteca que baixei do controlsFX 11.0.0
	requires org.controlsfx.controls; 
	
	opens basico;
	opens layout;
	opens fxml;
}