package application;

import model.Authentification;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CompteMedecinController extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("CompteMedecin.fxml"));
		Scene scene = new Scene(root,700,400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	/*public void déconnexion(java.awt.event.ActionEvent e) {
		
		Authentification a=new Authentification();
		a.setVisible(true);
		System.exit(0);
	}*/
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
