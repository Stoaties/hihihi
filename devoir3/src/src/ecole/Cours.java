package src.ecole;

import java.io.Serializable;
import java.util.HashSet;
import src.Etudiant;

public class Cours implements Serializable{
	private final String nom;
	private final String sigle;
	private HashSet<Etudiant> etudiants;
	
	public Cours(String nom, String sigle) {
		this.nom = nom;
		this.sigle = sigle;
		etudiants = new HashSet<Etudiant>();
	}

	public String getNom() {
		return nom;
	}

	public String getSigle() {
		return sigle;
	}

	public HashSet<Etudiant> getEtudiants() {
		return etudiants;
	}
	
	public String toString() {
		return sigle + " " + nom;
		
	}
}
