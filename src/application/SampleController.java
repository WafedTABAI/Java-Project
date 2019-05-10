package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController extends Application {
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		Scene scene = new Scene(root,700,400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	@FXML
	AnchorPane anchorPrincipal;
	AnchorPane newLoadedPane;

	@FXML
	public void afficherMedecin(ActionEvent e)
	{
		try {
			anchorPrincipal.getChildren().clear();
			newLoadedPane = new AnchorPane(); 		
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Medecin.fxml"));
			newLoadedPane=loader.load();
			anchorPrincipal.getChildren().add(newLoadedPane);
			MedecinController c = loader.<MedecinController>getController();
			
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
	}
}


