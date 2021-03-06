package src;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaseDonnees implements Serializable{
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	public void main(String []args) {
		
	}
	
	public void init() {
		Etudiant deleted = new Etudiant();
	}
}
