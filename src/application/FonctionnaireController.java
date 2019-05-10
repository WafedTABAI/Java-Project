package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Fonctionnaire;

public class FonctionnaireController extends Application{
	Fonctionnaire fct=new Fonctionnaire();
	@FXML
	TextField cinTxt,nomTxt,prenomTxt,mailTxt,numtelTxt,adresseTxt;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Fonctionnaire.fxml"));
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void enregistrerFCT(ActionEvent e) {
	fct.setCIN(Long.parseLong(cinTxt.getText()));
	fct.setNom(nomTxt.getText());
	fct.setPrenom(prenomTxt.getText());
	fct.setMail(mailTxt.getText());
	fct.setNumTel(Long.parseLong(numtelTxt.getText()));
	fct.setAdresse(adresseTxt.getText());
	System.out.println(fct.getCIN()+fct.getNom()+fct.getPrenom()+fct.getMail()+fct.getNumTel()+fct.getAdresse());
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
