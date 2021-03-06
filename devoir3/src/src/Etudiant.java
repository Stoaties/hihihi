package src;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Etudiant implements Serializable{
	private String nom;
	private String prenom;
	private Ecole ecole;
	private List<Etudiant> amis;
	private List<Conversation> convos;
	private List<Cours> cours;
	//private List<Groupe> groupes;
	private List<String> interets;
	private String email;
	private static final Etudiant ETUDIANT_DELETED= new Etudiant("deleted"," user ");
	
	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		ecole = new Ecole();
		amis = new  ArrayList<Etudiant>();
		convos = new  ArrayList<Conversation>();
		cours = new  ArrayList<Cours>();
		interets = new  ArrayList<String>();
		email = "";
	}
	
	public Etudiant() {
	}

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

	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	public List<Etudiant> getAmis() {
		return amis;
	}

	public void setAmis(List<Etudiant> amis) {
		this.amis = amis;
	}

	public List<Conversation> getConvos() {
		return convos;
	}

	public void setConvos(List<Conversation> convos) {
		this.convos = convos;
	}

	public List<Cours> getCours() {
		return cours;
	}

	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}

	public List<String> getInterets() {
		return interets;
	}

	public void setInterets(List<String> interets) {
		this.interets = interets;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	////////////////////////////////////////////////////////////////
	
	public void addAmi(Etudiant etudiant) {
		if(!amis.contains(etudiant)) {
			amis.add(etudiant);
		}
	}
	
	public void removeAmi(Etudiant etudiant) {
		amis.remove(etudiant);
		
	}
	

	

}
