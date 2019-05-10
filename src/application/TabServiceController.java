package application;


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
import model.Service;
import model.Medecin;

public class TabServiceController extends Application {
	
	private ObservableList <Service> listeObser;
	private List listServ;
	
	@FXML
	TableColumn clmNom, clmNombre, clmChefService;
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
		AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("TabService.fxml"));
		Scene scene = new Scene(root, 700, 400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}
	
	
	public void charger() {
		
		listServ = new ArrayList<Service>();
		
		Service serv1 = new Service(1,"ortho","wafed tabai", 50L,5);
		Service serv2 = new Service(2,"pedia","aymen toukebri", 25L,10);
		
	
		listServ.add(serv1);
		listServ.add(serv2);
		

		clmNom.setCellValueFactory(new PropertyValueFactory<>("Nom"));
		clmChefService.setCellValueFactory(new PropertyValueFactory<>("ChefService"));
		clmNombre.setCellValueFactory(new PropertyValueFactory<>("NombreChambre"));
		
		

		listeObser = FXCollections.observableArrayList(listServ);
		
		index = new SimpleIntegerProperty();
		tab.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<?> observable, Object oldvalue, Object newvalue) {
				index.set(listeObser.indexOf(newvalue));
			}
		});
		
		FilteredList<Service> filteredData = new FilteredList<>(listeObser, p -> true);
        rechText.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(myObject -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();
                if (String.valueOf(myObject.getNom()).toLowerCase().contains(lowerCaseFilter)||String.valueOf(myObject.getChefService()).toLowerCase().contains(lowerCaseFilter) ||String.valueOf(myObject.getNombreChambre()).toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                } 
                return false;
                });
        });
        
        SortedList<Service> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tab.comparatorProperty());
        tab.setItems(sortedData);
	}
	
	
	
	
	
    public void ajouter() throws IOException {
		
    	pane.getChildren().clear();
		newLoadedPane = new AnchorPane(); 		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Service.fxml"));
		newLoadedPane=loader.load();
		pane.getChildren().add(newLoadedPane);	
		
		//MedecinController c = loader.<MedecinController>getController();
	}

    public void modifier() throws IOException {
    	//int i = index.get();
    	int i = tab.getSelectionModel().getSelectedIndex();
    	if (i>-1) {
    	pane.getChildren().clear();
		newLoadedPane = new AnchorPane(); 		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ServiceM.fxml"));
		newLoadedPane=loader.load();
		pane.getChildren().add(newLoadedPane);	
		ServiceMController c = loader.<ServiceMController>getController();
		Service s = listeObser.get(index.get());
		c.charger(s);
    	}
	
    }
   @FXML 
   public void supprimer(ActionEvent e) {
	   listeObser.remove(tab.getSelectionModel().getSelectedIndex());
	   tab.getSelectionModel().clearSelection();
	   /*int i = index.get();
		if (i > -1) {
			
				listeObser.remove(i);
				
				
				//tab.getSelectionModel().clearSelection();
				//tab.getSelectionModel().getSelectedIndex();
		}*/
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

}