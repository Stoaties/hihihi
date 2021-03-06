package src;

import src.ecole.Cours;
import src.ecole.Ecole;
import src.ecole.Programme;

public class util {

	public static void addEtudiantCours(Etudiant etudiant, Cours cours) {

	}
	
	public static void removeEtudiantCours(Etudiant etudiant, Cours cours) {
		etudiant.getCours().remove(cours);
		cours.getEtudiants().remove(etudiant);
	}

	public static void addEtudiantProgramme(Etudiant etudiant, Programme programme) {
		//Enlever programem precedent
	}

	public static void removeEtudiantProgramme(Etudiant etudiant, Programme programme) {

	}

	public static void addEtudiantEcole(Etudiant etudiant, Ecole ecole) {
		//Enlever ecole precedente
	}

	public static void removeEtudiantEcole(Etudiant etudiant, Ecole ecole) {

		//Ne pas oublier d'enlever l'étudiant de tous les cours dans cette école
	}

	public static void addAmi(Etudiant e1, Etudiant e2) {

	}
	
	public static void removeAmi(Etudiant etudiant1, Etudiant etudiant2) {
		etudiant1.getAmis().remove(etudiant2);
		etudiant2.getAmis().remove(etudiant1);
	}
	
}
