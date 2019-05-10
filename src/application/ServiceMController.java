package application;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Medecin;
import model.Service;
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


public class ServiceMController extends Application {

@FXML
TextField nomTxt,nbrTxt,cinTxt;

@FXML
AnchorPane pane;
AnchorPane newLoadedPane;
@Override
public void start(Stage primaryStage) throws Exception {
	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ServiceM.fxml"));
	Scene scene = new Scene(root,308,550);
	primaryStage.setScene(scene);
	primaryStage.setResizable(false);
	primaryStage.show();
	
}



public void charger(Service s) throws IOException {
	//cinTxt,nomTxt,prenomTxt,mailTxt,numtelTxt,adresseTxt,specialiteTxt,serviceTxt,
	
	nomTxt.setText(s.getNom());
	nbrTxt.setText(s.getNombreChambre()+"");
	cinTxt.setText(s.getCINChefService()+"");
	
	
	
}




public void enregistrerSS() throws IOException {
	Service s = new Service(); //CHOUF'HA TJI LDE5EL WALA LBARA KIFKIF WALE FIL BASE DE DONNEE (LOCAL/GLOBAL)
	
	s.setNom(nomTxt.getText());
	s.setNombreChambre(Integer.parseInt(nbrTxt.getText()+""));
	s.setCINChefService(Long.parseLong(cinTxt.getText()));
	
	
	
	
	
	pane.getChildren().clear();
	newLoadedPane = new AnchorPane(); 		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("TabService.fxml"));
	newLoadedPane=loader.load();
	pane.getChildren().add(newLoadedPane);
	TabServiceController c = loader.<TabServiceController>getController();
	c.charger();
	
	}
public static void main(String[] args) {
	launch(args);
}


}
