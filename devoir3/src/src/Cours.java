package src;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cours implements Serializable{
	private String nom;
	private String sigle;
	private List<Etudiant> etudiants;
	
	public Cours(String nom) {
		this.nom = nom;
		etudiants = new ArrayList<Etudiant>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	public void addEtudiant(Etudiant etudiant) {
		if(!etudiants.contains(etudiant)) {
			etudiants.add(etudiant);
		}
	}
	
	
}
