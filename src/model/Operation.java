package model;
//import java.sql.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Operation {
	private date Date;
	private heure Heure;
	private double Duree;
	private int CINPatient; // le patient sera dej� enregistr� donc il est entr� seulement par son num ss et apr�s on peut r�cup�rer ses donn�es
	private double Cout;
	private String Remarque = new String();
	private String Service;
	public date getDate() {
		return Date;
	}
	public void setDate(date date) {
		Date = date;
	}
	public heure getHeure() {
		return Heure;
	}
	public void setHeure(heure heure) {
		Heure = heure;
	}
	public double getDuree() {
		return Duree;
	}
	public void setDuree(double duree) {
		Duree = duree;
	}
	public int getCINPatient() {
		return CINPatient;
	}
	public void setCINPatient(int cINPatient) {
		CINPatient = cINPatient;
	}
	public double getCout() {
		return Cout;
	}
	public void setCout(double cout) {
		Cout = cout;
	}
	public String getRemarque() {
		return Remarque;
	}
	public void setRemarque(String remarque) {
		Remarque = remarque;
	}
	public String getService() {
		return Service;
	}
	public void setService(String service) {
		Service = service;
	}
	
	
	
	
	
	
	
	/*
	public void EntrerOperation()
	{   Scanner x = new Scanner(System.in);
		System.out.println("Donner la date de l'operation");
		this.Date=x.next();
		System.out.println("Donner la dur�e �stim�e pour cet operation en heures ");
		this.DureeEstime=x.nextDouble();
		//System.out.println("Donner le numero du s�curit� social du patient qui va subir cet op�ration" );
		//this.patient=x.nextInt();
		System.out.println("Donner les details de cet operation" );
		x.nextLine();
		this.remarque=x.nextLine();
		
		
	}
	public void AfficherOperation()
	{
		System.out.println("La date de cette operation est :" + date);
		System.out.println("Dur�e �stim�e "+DureeEstime+" heures");
		System.out.println("Details not�s :\n" + remarque);
		// il sera un affichage du num secu nom et prenom du patient apres l �laboration du base de donn�es
		
			
		
	}
	public void ajouterRemarque()
	{
		Scanner sc = new Scanner(System.in);
		String NouvelleRemarque = new String();
		System.out.println("Donner votre remaque");
		NouvelleRemarque=sc.nextLine();
		this.remarque=this.remarque+"\n"+NouvelleRemarque;
	}*/

}