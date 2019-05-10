package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Directeur;
import model.Medecin;
import model.Service;

public class NoteController extends Application {
	@FXML
	TextField noteTxt;
	@FXML
	AnchorPane pane;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Note.fxml"));
		Scene scene = new Scene(root,308,550);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public void charger(String s) throws IOException {
		//cinTxt,nomTxt,prenomTxt,mailTxt,numtelTxt,adresseTxt,specialiteTxt,serviceTxt,
		
		noteTxt.setText(s);
		
		
	}
	
	public void enregistrerN(/*CompteDirecteurController c*/) throws IOException {
		Directeur d = new Directeur(); //Hedha deja fil base maaneha
		d.setNote(noteTxt.getText());
		pane.getChildren().clear();
		
		
		
		
		//FXMLLoader loader = new FXMLLoader(getClass().getResource("CompteDirecteur.fxml"));
		//CompteDirecteurController c = loader.<CompteDirecteurController>getController();
		//c.chargerN();
		//CompteDirecteurController c = new CompteDirecteurController();
		
		
		//Stage a = (Stage) noteTxt.getScene().get();
		/*newLoadedPane=loader.load();
	
		CompteDirecteurController c = loader.<CompteDirecteurController>getController();
		c.charger();*/
	}

}
