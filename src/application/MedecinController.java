package application;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Medecin;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MedecinController extends Application {

@FXML
TextField cinTxt,nomTxt,prenomTxt,mailTxt,numtelTxt,adresseTxt,specialiteTxt,serviceTxt;
@FXML
CheckBox chefService;
@FXML
AnchorPane pane;
AnchorPane newLoadedPane;
@Override
public void start(Stage primaryStage) throws Exception {
	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Medecin.fxml"));
	Scene scene = new Scene(root,308,550);
	primaryStage.setScene(scene);
	primaryStage.setResizable(false);
	primaryStage.show();
	
}

/*public void charger(Medecin m) throws IOException {
	//cinTxt,nomTxt,prenomTxt,mailTxt,numtelTxt,adresseTxt,specialiteTxt,serviceTxt,
	cinTxt.setText(m.getCIN()+"");
	nomTxt.setText(m.getNom());
	prenomTxt.setText(m.getPrenom());
	mailTxt.setText(m.getMail());
	numtelTxt.setText(m.getNumTel()+"");
	adresseTxt.setText(m.getAdresse());
	specialiteTxt.setText(m.getSpecialite());
	serviceTxt.setText(m.getService());
	chefService.setSelected(m.isChefService());
	
	
}*/

public void enregistrerM() throws IOException {
	Medecin m = new Medecin(); //CHOUF'HA TJI LDE5EL WALA LBARA KIFKIF WALE FIL BASE DE DONNEE (LOCAL/GLOBAL)
	m.setCIN(Long.parseLong(cinTxt.getText()));
	m.setNom(nomTxt.getText());
	m.setPrenom(prenomTxt.getText());
	m.setMail(mailTxt.getText());
	m.setNumTel(Long.parseLong(numtelTxt.getText()));
	m.setAdresse(adresseTxt.getText());
	m.setSpecialite(specialiteTxt.getText());
	m.setService(serviceTxt.getText());
	if(chefService.isSelected()) {
		m.setChefService(true);
	}else {
		m.setChefService(false);
	}
	
	
	
	pane.getChildren().clear();
	newLoadedPane = new AnchorPane(); 		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("TabMedecin.fxml"));
	newLoadedPane=loader.load();
	pane.getChildren().add(newLoadedPane);
	TabMedecinController c = loader.<TabMedecinController>getController();
	c.charger();
	
	}



public static void main(String[] args) {
	launch(args);
}


}
