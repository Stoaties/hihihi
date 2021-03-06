package src;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import src.convos.Conversation;
import src.ecole.Cours;
import src.ecole.Ecole;
import src.ecole.Programme;

public class Etudiant implements Serializable{
	private String nom;
	private String prenom;
	private Ecole ecole;
	private Programme programme;


	private Set<Etudiant> amis = new HashSet<>();
	private Set<Conversation> convos =new HashSet<>();
	private Set<Cours> cours=new HashSet<>();
	//private List<Groupe> groupes;
	private Set<String> interets=new HashSet<>();
	private String email;
	public static final Etudiant ETUDIANT_DELETED= new Etudiant("deleted"," user ", "deleted@user");
	
	public Etudiant(String nom, String prenom, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		ecole = null;
	}
	

	////////////////////////////////////////////////////////////////
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}
	
	public Programme getProgramme() {
		return programme;
	}


	public void setProgramme(Programme programme) {
		this.programme = programme;
	}

	
	public Set<Etudiant> getAmis() {
		return amis;
	}


	public Set<Conversation> getConvos() {
		return convos;
	}


	public Set<Cours> getCours() {
		return cours;
	}


	public Set<String> getInterets() {
		return interets;
	}


	public static Etudiant getEtudiantDeleted() {
		return ETUDIANT_DELETED;
	}
	
	public String toStringFull() {
		return prenom + " " + nom +  " | Ecole: " + ecole.toString();
	}
	
	public String toString() {
		return prenom + " " + nom;
	}
	
	////////////////////////////////////

	

}
