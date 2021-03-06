package src;

public class util {
	
	
	public static void removeEtudiantCours(Etudiant etudiant, Cours cours) {
		etudiant.getCours().remove(cours);
		cours.getEtudiants().remove(etudiant);
	}
	
	public static void removeAmi(Etudiant etudiant1, Etudiant etudiant2) {
		etudiant1.getAmis().remove(etudiant2);
		etudiant2.getAmis().remove(etudiant1);
	}
	
	
}
