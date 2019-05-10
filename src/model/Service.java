package model;

import java.util.Hashtable;
import java.util.Scanner;
public class Service {
	 int ID;
	 String Nom;
	 String ChefService;
	 long CINChefService;
	 //Medecin ChefService;
	 int NombreChambre;
	
	
	/*Hashtable Chambre = new Hashtable(); // ID : num chambre et valeur malade
	Hashtable Materiel = new Hashtable(); // ID: du type matériel et valeur type matériel matériel
	Hashtable Medicament = new Hashtable();*/
	
	public Service() {}
	
	
	
	







	public Service(int iD, String nom, String chefService, long cINChefService, int nombreChambre) {
		super();
		ID = iD;
		Nom = nom;
		ChefService = chefService;
		CINChefService = cINChefService;
		NombreChambre = nombreChambre;
	}











	public int getID() {
		return ID;
	}











	public void setID(int iD) {
		ID = iD;
	}











	public long getCINChefService() {
		return CINChefService;
	}











	public void setCINChefService(long cINChefService) {
		CINChefService = cINChefService;
	}











	public String getChefService() {
		return ChefService;
	}


	public void setChefService(String chefService) {
		ChefService = chefService;
	}


	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public long getNombreChambre() {
		return NombreChambre;
	}
	public void setNombreChambre(int nombreChambre) {
		NombreChambre = nombreChambre;
	}



	
	//chambre
	//tableau de materiels -> responsable
	// tableau de services 
	//materiel -> idservice 
	
	

}
