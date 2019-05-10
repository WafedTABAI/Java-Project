package model;
import java.util.Scanner;
import java.util.Enumeration;
import java.util.Hashtable;
public class ResponsableLogistique extends Fonctionnaire {
     
	Hashtable Materiel = new Hashtable(); // id unique qui reference chaque service, la valeur de chaque id est un tabelau de materiel arraylist par exemple

	public Hashtable getMateriel() {
		return Materiel;
	}

	public void setMateriel(Hashtable materiel) {
		Materiel = materiel;
	}
	
	
	/*//tab de mat
	public void Entrer() {
		Scanner y = new Scanner(System.in);
		System.out.println("Veuillez entrer données du directeur:");
		super.Entrer(y);
		y.close();
		
	}
	
public void Afficher() {
		
		super.Afficher();
	
	}*/
}
