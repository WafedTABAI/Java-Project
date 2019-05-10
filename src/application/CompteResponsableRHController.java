package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CompteResponsableRHController extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("CompteResponsablePharmacie.fxml"));
		Scene scene = new Scene(root,700,400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

	
	
	public static void main(String[] args) {
		launch(args);
	}
}
