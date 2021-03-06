package src;

import src.ecole.Cours;
import src.ecole.Ecole;
import src.ecole.Programme;

public class Util {

	public static void addEtudiantCours(Etudiant etudiant, Cours cours) {
		if (!etudiant.getCours().contains(cours)) {
			etudiant.getCours().add(cours);
			cours.getEtudiants().add(etudiant);
		}
	}

	public static void removeEtudiantCours(Etudiant etudiant, Cours cours) {
		cours.getEtudiants().remove(etudiant);
		etudiant.getCours().remove(cours);
	}

	public static void changeEtudiantProgramme(Etudiant etudiant, Programme programme) {
		if(etudiant.getProgramme()!=null) {
			etudiant.getProgramme().getEtudiants().remove(etudiant);
		}
		programme.getEtudiants().add(etudiant);
		etudiant.setProgramme(programme);
	}
	
	public static void changeEtudiantEcole(Etudiant etudiant, Ecole ecole) {
		// Enlever ecole precedente
		if (etudiant.getEcole() != null) {
			changeEtudiantProgramme(etudiant,null);
			for (Cours c : etudiant.getCours()) {
				removeEtudiantCours(etudiant, c);
			}
			etudiant.getEcole().getEtudiants().remove(etudiant);
		}
		ecole.getEtudiants().add(etudiant);
		etudiant.setEcole(ecole);
	}

	
	public static void addAmi(Etudiant e1, Etudiant e2) {
		e1.getAmis().add(e2);
		e2.getAmis().add(e1);

	}

	public static void removeAmi(Etudiant e1, Etudiant e2) {
		e1.getAmis().remove(e2);
		e2.getAmis().remove(e1);
	}

}
