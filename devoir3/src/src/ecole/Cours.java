package src.ecole;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import src.Etudiant;

public class Cours implements Serializable{
	private final String nom;
	private final String sigle;
	private List<Etudiant> etudiants;
	
	public Cours(String nom, String sigle) {
		this.nom = nom;
		this.sigle = sigle;
		etudiants = new ArrayList<Etudiant>();
	}

	public String getNom() {
		return nom;
	}

	public String getSigle() {
		return sigle;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
}
