package application;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Infirmier;

public class TabInfirmierController extends Application {
	
	private ObservableList <Infirmier> listeObser;
	
	private List<Infirmier> listInf= new ArrayList<Infirmier>();
	
	@FXML
	TableColumn clmNom, clmPrenom, clmService,clmMail;
	@FXML
	TableView tab;
	@FXML
	AnchorPane pane;
	@FXML
	TextField rechText;
	
	AnchorPane newLoadedPane;
	private IntegerProperty index;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("TabInfirmier.fxml"));
		Scene scene = new Scene(root, 700, 400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}
	
	
	public void charger() {
		Infirmier inf1 = new Infirmier(1L, "wafed", "prenom", "mail", 15L, "adresse","note",1,"123","service", true);
		Infirmier inf2 = new Infirmier(2L, "aymen", "prenom", "mail", 15L, "adresse","note",2,"123","service", true);
	
		
		listInf.add(inf1);
		listInf.add(inf2);
		

		clmNom.setCellValueFactory(new PropertyValueFactory<>("Nom"));
		
		clmPrenom.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
		clmService.setCellValueFactory(new PropertyValueFactory<>("Service"));
		clmMail.setCellValueFactory(new PropertyValueFactory<>("Mail"));
		

		listeObser = FXCollections.observableArrayList(listInf);
		//tab.setItems(listeObser);
		
		index = new SimpleIntegerProperty();
		tab.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<?> observable, Object oldvalue, Object newvalue) {
				index.set(listeObser.indexOf(newvalue));
			}
		});
		
		FilteredList<Infirmier> filteredData = new FilteredList<>(listeObser, p -> true);
        rechText.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(myObject -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();
                if (String.valueOf(myObject.getNom()).toLowerCase().contains(lowerCaseFilter)||String.valueOf(myObject.getPrenom()).toLowerCase().contains(lowerCaseFilter) ||String.valueOf(myObject.getMail()).toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                } 
                return false;
                });
        });
        
        SortedList<Infirmier> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tab.comparatorProperty());
        tab.setItems(sortedData);
	}
		
		
		
		
	
	
	
	
	
	@FXML
    public void ajouter() throws IOException {
		
    	pane.getChildren().clear();
		newLoadedPane = new AnchorPane(); 		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Infirmier.fxml"));
		newLoadedPane=loader.load();
		pane.getChildren().add(newLoadedPane);	
		//MedecinController c = loader.<MedecinController>getController();
	}

    /*public void modifier() throws IOException {
	
	
    	//int i = index.get();
    	int i = tab.getSelectionModel().getSelectedIndex();
    	if (i>-1) {
    	pane.getChildren().clear();
		newLoadedPane = new AnchorPane(); 		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Infirmier.fxml"));
		newLoadedPane=loader.load();
		pane.getChildren().add(newLoadedPane);	
		InfirmierController c = loader.<InfirmierController>getController();
		
		Infirmier in = listeObser.get(index.get());
		c.charger(in);
    	}
	
}*/
    
    @FXML 
    public void supprimer(ActionEvent e) {
 	   listeObser.remove(tab.getSelectionModel().getSelectedIndex());
 	   tab.getSelectionModel().clearSelection();
    }
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
