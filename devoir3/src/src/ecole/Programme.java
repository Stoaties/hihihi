package src.ecole;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import src.Etudiant;

public class Programme implements Serializable{
	private Set<Etudiant> etudiants  = new HashSet<>();


	private String nom;
	
	public Programme(String nom) {
		this.nom=nom;
	}
	
	public Set<Etudiant> getEtudiants() {
		return etudiants;
	}
	
}
