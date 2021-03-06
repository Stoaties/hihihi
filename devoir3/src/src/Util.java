package src;

import src.ecole.Cours;
import src.ecole.Ecole;
import src.ecole.Programme;

public class Util {

	public static void addEtudiantCours(Etudiant etudiant, Cours cours) {
		if(!etudiant.getCours().contains(cours)) {
			etudiant.getCours().add(cours);
			cours.getEtudiants().add(etudiant);
		}
	}
	
	public static void removeEtudiantCours(Etudiant etudiant, Cours cours) {
		cours.getEtudiants().remove(etudiant);
		etudiant.getCours().remove(cours);
	}

	public static void addEtudiantProgramme(Etudiant etudiant, Programme programme) {
		if(etudiant.getProgramme()==null) {
			programme.getEtudiants().add(etudiant);
			etudiant.setProgramme(programme);
		}

	}

	public static void removeEtudiantProgramme(Etudiant etudiant) {
		etudiant.getProgramme().getEtudiants().remove(etudiant);
		etudiant.setProgramme(null);
	}

	public static void addEtudiantEcole(Etudiant etudiant, Ecole ecole) {
		//Enlever ecole precedente
		if(etudiant.getEcole()!=null) {
			removeEtudiantEcole(etudiant);
		}
		ecole.getEtudiants().add(etudiant);
		etudiant.setEcole(ecole);
		
	}

	public static void removeEtudiantEcole(Etudiant etudiant) {
		//Ne pas oublier d'enlever l'étudiant de tous les cours dans cette école
		removeEtudiantProgramme(etudiant);
		for(Cours c : etudiant.getCours()) {
			removeEtudiantCours(etudiant,c);
		}
		etudiant.getEcole().getEtudiants().remove(etudiant);
		etudiant.setEcole(null);
		
	}

	public static void addAmi(Etudiant e1, Etudiant e2) {
		
	}
	
	public static void removeAmi(Etudiant etudiant1, Etudiant etudiant2) {
		etudiant1.getAmis().remove(etudiant2);
		etudiant2.getAmis().remove(etudiant1);
	}
	
}
