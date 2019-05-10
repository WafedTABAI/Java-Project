package model;
import java.util.Scanner;

public class Infirmier extends Fonctionnaire {
	private String  Service;
	private boolean ChefInfirmier;
	
	
	
	
	
	
	
	
	public Infirmier(long cIN, String nom, String prenom, String mail, long numTel, String adresse, String note, int iD,
			String password, String service, boolean chefInfirmier) {
		super(cIN, nom, prenom, mail, numTel, adresse, note, iD, password);
		Service = service;
		ChefInfirmier = chefInfirmier;
	}
	public String getService() {
		return Service;
	}
	public void setService(String service) {
		Service = service;
	}
	public boolean isChefInfirmier() {
		return ChefInfirmier;
	}
	public void setChefInfirmier(boolean chefInfirmier) {
		ChefInfirmier = chefInfirmier;
	}
	
	
	
	
	public Infirmier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	/*
	//tableau

	///*public Infirmier(/*tab matriel*///)//*/ {*/
		//super();
	//} */*/

	/*public void Entrer() {
		Scanner y = new Scanner(System.in);

		System.out.println("Veuillez entrer données de cet infirmier:");
		super.Entrer(y);
		System.out.println("Cet infirmier est affécté à quel service?");
        this.Service=y.next();
		this.ChefInfirmier=false;
		System.out.println("Cet Infirmier est-il le chef des infirmiers de ce service? OUI/NON");
        if(y.next().equals("oui")) 
	    this.ChefInfirmier=true;
		y.close();
	}
	
	public void Afficher() {
		
		super.Afficher();
		System.out.println("Cet infirmier est affecté au service: " + Service);
		if(ChefInfirmier)
			System.out.println("Cet infirmier est le chef des Infirmiers de ce service!");
	
	}*/
	
}
