package src.ecole;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import src.Etudiant;

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
	
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public List<Programme> getProgrammes() {
		return programmes;
	}

	public List<Cours> getCours() {
		return cours;
	}
}
