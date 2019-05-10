package application;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Infirmier;
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


public class InfirmierController extends Application {

@FXML
TextField cinTxt,nomTxt,prenomTxt,mailTxt,numtelTxt,adresseTxt,serviceTxt;
@FXML
CheckBox chefInfirmier;
@FXML
AnchorPane pane;
AnchorPane newLoadedPane;
@Override
public void start(Stage primaryStage) throws Exception {
	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Infirmier.fxml"));
	Scene scene = new Scene(root,308,550);
	primaryStage.setScene(scene);
	primaryStage.setResizable(false);
	primaryStage.show();
}


/*public void charger(Infirmier i) throws IOException {
	//cinTxt,nomTxt,prenomTxt,mailTxt,numtelTxt,adresseTxt,specialiteTxt,serviceTxt,
	cinTxt.setText(i.getCIN()+"");
	nomTxt.setText(i.getNom());
	prenomTxt.setText(i.getPrenom());
	mailTxt.setText(i.getMail());
	numtelTxt.setText(i.getNumTel()+"");
	adresseTxt.setText(i.getAdresse());
	//specialiteTxt.setText(m.getSpecialite());
	serviceTxt.setText(i.getService());
	chefInfirmier.setSelected(i.isChefInfirmier());
	
	
}*/



 

public void enregistrerI() throws IOException {
	Infirmier i = new Infirmier(); //CHOUF'HA TJI LDE5EL WALA LBARA KIFKIF WALE FIL BASE DE DONNEE(LOCAL/GLOBAL)
	i.setCIN(Long.parseLong(cinTxt.getText()));
	i.setNom(nomTxt.getText());
	i.setPrenom(prenomTxt.getText());
	i.setMail(mailTxt.getText());
	i.setNumTel(Long.parseLong(numtelTxt.getText()));
	i.setAdresse(adresseTxt.getText());
	//i.setSpecialite(specialiteTxt.getText());
	i.setService(serviceTxt.getText());
	if(chefInfirmier.isSelected()) {
		i.setChefInfirmier(true);
	}else {
		i.setChefInfirmier(false);
	}
	
	
	pane.getChildren().clear();
	newLoadedPane = new AnchorPane(); 		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("TabInfirmier.fxml"));
	newLoadedPane=loader.load();
	pane.getChildren().add(newLoadedPane);
	TabInfirmierController c = loader.<TabInfirmierController>getController();
	c.charger();

}


public static void main(String[] args) {
	launch(args);
}


}
