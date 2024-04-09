package BCD;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BCD extends Application{
	TextField tInserisci=new TextField("");
	Button bConverti=new Button("Converti");
	Label lRisultato=new Label("La conversione è:");
	public void start(Stage finestra) {
		GridPane griglia=new GridPane();
		griglia.add(tInserisci, 0, 1);
		griglia.add(bConverti, 0, 2);
		griglia.add(lRisultato, 0, 3);
		Scene scena = new Scene(griglia);
		finestra.setTitle("BCD");
		finestra.setScene(scena);
		finestra.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);

	}
}
