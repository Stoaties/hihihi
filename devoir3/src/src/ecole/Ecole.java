package src.ecole;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import src.Etudiant;

public class Ecole implements Serializable{
	private String nom;
	
	private HashSet<Etudiant> etudiants;
	private HashSet<Programme> programmes;
	private HashSet<Cours> cours;

	public Ecole(String nom) {
		this.nom = nom;
		etudiants = new HashSet<Etudiant>();
		programmes = new HashSet<Programme>();
		cours = new HashSet<Cours>();
	}
	
	public HashSet<Etudiant> getEtudiants() {
		return etudiants;
	}

	public HashSet<Programme> getProgrammes() {
		return programmes;
	}

	public HashSet<Cours> getCours() {
		return cours;
	}
	
	public String toString() {
		return nom + " nb etudiants : " + etudiants.size();
	}
	
	public void addCours(Cours cours) {
		this.cours.add(cours);
	}
}
