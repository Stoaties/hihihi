package src;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ecole implements Serializable{
	private String nom;
	
	private List<Etudiant> etudiants;
	private List<Programme> programmes;
	private List<Cours> cours;

	public Ecole(String nom) {
		this.nom = nom;
		etudiants = new ArrayList<Etudiant>();
		programmes = new ArrayList<Programme>();
		cours = new ArrayList<Cours>();
	}
	
	public Ecole() {
		nom = "";
		etudiants = new ArrayList<Etudiant>();
		programmes = new ArrayList<Programme>();
		cours = new ArrayList<Cours>();
	}
	
	public void removeEtudiant(Etudiant etudiant) {
		etudiants.remove(etudiants);
	}
}
