package model;
import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;

public class Fonctionnaire {
	   long CIN;
	   String  Nom;
	   String  Prenom;
	   String  Mail;
	   long NumTel;
	   String Adresse;
	   String Note ;
	   int ID;
	   String Password;
	   
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Fonctionnaire(long cIN, String nom, String prenom, String mail, long numTel, String adresse, String note,
			int iD, String password) {
		super();
		CIN = cIN;
		Nom = nom;
		Prenom = prenom;
		Mail = mail;
		NumTel = numTel;
		Adresse = adresse;
		Note = note;
		ID = iD;
		Password = password;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public Fonctionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	   
	  
	   
	   
	   
	 
	   
	   
	  /* protected void Entrer(Scanner x) {
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
	   
	   protected void Afficher()
	   {
	 	  System.out.println("CIN: " + CIN);
	 	  System.out.println("Nom et Prenom: " + Nom +" " + Prenom);
	 	  System.out.println("e-mail: " + Mail);
	 	  System.out.println("Tel: " + NumTel);
	 	  System.out.println("Adresse: " + Adresse);
	 	 
	 	  
	 	  
	   }*/
	   
	   
}
