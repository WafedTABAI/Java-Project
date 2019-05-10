package model;
import java.util.Scanner;

public class Malade {
	   long CIN;
	   String  Nom;
	   String  Prenom;
	   String  Mail;
	   long NumTel;
	   String Adresse;
	   
	   
	public long getCIN() {
		return CIN;
	}
	public void setCIN(long cIN) {
		CIN = cIN;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public long getNumTel() {
		return NumTel;
	}
	public void setNumTel(long numTel) {
		NumTel = numTel;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	   
	   
	   
	   
	   /*
	   public void Entrer(Scanner x) {
			  System.out.println("Donner la CIN:");
			  this.CIN=x.nextInt();
			  System.out.println("Donner le nom:");
			  this.Nom=x.next();
			  System.out.println("Donner le prenom:");
			  this.Prenom=x.next();
			  System.out.println("Donner le mail:");
			  this.Mail=x.next();
			  System.out.println("Donner le numéro de telephone:");
			  this.NumTel=x.nextInt();
			  System.out.println("Donner l'adresse:");
			  this.Adresse=x.next();
			
	   }
	   
	   public void Afficher()
	   {
	 	  System.out.println("CIN: " + CIN);
	 	  System.out.println("Nom et Prenom: " + Nom +" " + Prenom);
	 	  System.out.println("e-mail: " + Mail);
	 	  System.out.println("Tel: " + NumTel);
	 	  System.out.println("Adresse: " + Adresse);
	 	 
	 	  
	 	  
	   }*/

}
