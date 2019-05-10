package model;

//import java.util.HashSet;
//import java.util.Iterator;
import java.util.Scanner;

public class Medecin extends Fonctionnaire {
  
  private String Specialite; // la spécialité du medecin
   
  private String  Service;
  private boolean ChefService;// une variable qui prend true s'il est chef service et false sinon
 // HashSet<operation> OP = new HashSet<operation>();
  //HashSet<consultation> CONS = new HashSet<consultation>();

  
  
  
public String getSpecialite() {
	return Specialite;
}











public Medecin(long cIN, String nom, String prenom, String mail, long numTel, String adresse, String note, int iD,
		String password, String specialite, String service, boolean chefService) {
	super(cIN, nom, prenom, mail, numTel, adresse, note, iD, password);
	Specialite = specialite;
	Service = service;
	ChefService = chefService;
}











public Medecin() {
	super();
	// TODO Auto-generated constructor stub
}
public void setSpecialite(String specialite) {
	Specialite = specialite;
}
public boolean isChefService() {
	return ChefService;
	
}
public void setChefService(boolean chefService) {
	ChefService = chefService;
}
public String getService() {
	return Service;
}
public void setService(String service) {
	Service = service;
}
  
  
     
  
  
  
/*
  public void Entrer() {
		Scanner y = new Scanner(System.in);

		System.out.println("Veuillez entrer les données de ce médecin:");
		super.Entrer(y);
		System.out.println("Ce médecin est spécialisé en quoi?");
		this.Specialite=y.next();
		System.out.println("Ce médecin est affécté à quel service?");
        this.Service=y.next();
		this.ChefService=false;
		System.out.println("Ce médecin est-il le chef de ce service? OUI/NON");
        if(y.next().equals("oui")) 
	    this.ChefService=true;
		y.close();
	}
  
  public void Afficher() {
		
		super.Afficher();
		System.out.println("Ce médecin est spécialisé en: " + Specialite);
		System.out.println("Ce médecin est affecté au service: " + Service);
		if(ChefService)
			System.out.println("Ce médecin est le chef de ce service!");
	
	}
 /*public void AfficherOperations()
  {
	  Iterator<operation> it=OP.iterator() ;
	  while(it.hasNext())
		  it.next().AfficherOperation();	  
  }
  public void AjouterOperation(operation o)
  {  
	  o.EntrerOperation();
	  OP.add(o);
  }
 
  public void AnnulerOperation(operation o)
  {
	  OP.remove(o);
  }*/
  
}


