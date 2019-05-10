package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class AuthentificationController extends Application {
	@FXML TextField cinTxt;
	@FXML private PasswordField passwordBox;
	@FXML
	AnchorPane pane;
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Authentification.fxml"));
		Scene scene = new Scene(root,690,396);
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		primaryStage.show();
		
	}
	
	
	@FXML
	public void identification (ActionEvent e) throws IOException {
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CompteDirecteur.fxml"));
		Stage stage = new Stage();

		try {
			stage.setScene(new Scene((Pane) loader.load()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		stage.setTitle("CompteDirecteur");
		//SampleController c = loader.<SampleController>getController();
		
		stage.show();
		//fermer fenetre
		Stage a = (Stage) cinTxt.getScene().getWindow();
		a.close();
			
		
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
