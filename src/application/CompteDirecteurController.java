package application;

import java.io.IOException;
import java.util.List;

import javafx.application.Application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Directeur;
import model.Service;

public class CompteDirecteurController extends Application {
	
    AnchorPane newLoadedPane;
	@FXML
	TextField cinTxt,nomTxt,prenomTxt,numtelTxt,mailTxt,adresseTxt,mdpTxt;
	
	
	@FXML
	Label rTxt,noteTxt;
	@FXML
	AnchorPane pane;
	@FXML
	AnchorPane paneS;
	@FXML
	AnchorPane paneN;
	@FXML
	Text bvnText;
	
	
	Directeur d = new Directeur(5L," w", "a", "@", 5L, "s","Réunion à 14h",1,"123");
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("CompteDirecteur.fxml"));
		Scene scene = new Scene(root, 700, 400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	@FXML
	public void initialisation() throws IOException {

		cinTxt.setText(d.getCIN()+"");
		nomTxt.setText(d.getNom());
		prenomTxt.setText(d.getPrenom());
		mailTxt.setText(d.getMail());
		numtelTxt.setText(d.getNumTel()+"");
		adresseTxt.setText(d.getAdresse());
		noteTxt.setText(d.getNote());
		rTxt.setText("hhhhhh");
		mdpTxt.setText(d.getPassword());
		
		
		
		ActionEvent e = null;
		clearpaneM(e);
		ActionEvent a = null;
		clearpaneS(a);
	}
	
	@FXML
	
	public void clearpaneM(ActionEvent e) throws IOException {
		pane.getChildren().clear();
		newLoadedPane = new AnchorPane(); 		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("TabMedecin.fxml"));
		newLoadedPane=loader.load();
		pane.getChildren().add(newLoadedPane);
		TabMedecinController c = loader.<TabMedecinController>getController();
		c.charger();
		
		
		
		}
	@FXML
	public void clearpaneI(ActionEvent e) throws IOException {
		pane.getChildren().clear();
		newLoadedPane = new AnchorPane(); 		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("TabInfirmier.fxml"));
		newLoadedPane=loader.load();
		pane.getChildren().add(newLoadedPane);
		TabInfirmierController c = loader.<TabInfirmierController>getController();
		c.charger();
		
		}
	
	@FXML
	public void clearpaneS(ActionEvent e) throws IOException {
		paneS.getChildren().clear();
		newLoadedPane = new AnchorPane(); 		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("TabService.fxml"));
		newLoadedPane=loader.load();
		paneS.getChildren().add(newLoadedPane);
		TabServiceController c = loader.<TabServiceController>getController();
		c.charger();
		
		}
	
@FXML
	
	public void deconnexion(ActionEvent e) throws IOException {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Authentification.fxml"));
	Stage stage = new Stage();

	try {
		stage.setScene(new Scene((Pane) loader.load()));
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	stage.setTitle("Authentification");
	//SampleController c = loader.<SampleController>getController();
	
	stage.show();
	//fermer fenetre
	Stage a = (Stage) bvnText.getScene().getWindow();
	a.close();
		
		}
@FXML
public void enregistrer() throws IOException {
	 //CHOUF'HA TJI LDE5EL WALA LBARA KIFKIF WALE FIL BASE DE DONNEE (LOCAL/GLOBAL)
	
	d.setNom(nomTxt.getText());
	d.setPrenom(prenomTxt.getText());
	d.setCIN(Long.parseLong(cinTxt.getText()));
	d.setNumTel(Long.parseLong(numtelTxt.getText()));
	d.setMail(mailTxt.getText());
	d.setAdresse(adresseTxt.getText());
	
}

@FXML
public void modifier() throws IOException {
	
	//paneN.getChildren().clear();
	newLoadedPane = new AnchorPane(); 		
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Note.fxml"));
	newLoadedPane=loader.load();
	paneN.getChildren().add(newLoadedPane);	
	NoteController c = loader.<NoteController>getController();
	String s = d.getNote();
	c.charger(s);
	}


@FXML
public void chargerN() {
	
	noteTxt.setText(d.getNote());
	
	
}
	public static void main(String[] args) {
		
		launch(args);
		//CompteDirecteurController c = new CompteDirecteurController();
		
		
		
		
	}
}
