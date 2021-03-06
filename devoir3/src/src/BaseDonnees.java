package src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import src.ecole.Cours;
import src.ecole.Ecole;

public class BaseDonnees implements Serializable {
	private Set<Etudiant> etudiants = new HashSet<Etudiant>();
	private Set<Ecole> ecoles = new HashSet<Ecole>();
	private static BaseDonnees bd = null;
	
	public static void main(String[] args) {
		
		init();
		
		if(bd==null) {
			bd = new BaseDonnees();
			Etudiant etu = new Etudiant("Adrien", "Marcotte", "ouioui"); 
			Etudiant etu2 = new Etudiant("Corentin", "Gouanvic", "nonnon") ;
			Ecole ecole = new Ecole("UdeM");
			Util.changeEtudiantEcole(etu, ecole);
			Util.changeEtudiantEcole(etu2, ecole);
			bd.etudiants.add(etu);
			bd.etudiants.add(etu2);
			Cours cou = new Cours("Interface" , "IFT2905");
			ecole.addCours(cou);
			Util.addEtudiantCours(etu, cou);
			
		}
		System.out.println(bd.etudiants.toString());	
		
		for(Etudiant e: bd.etudiants) {
			
			System.out.println(e.getNom() + " " + e.getCours());
		}
		save();
	}

	public static void init() {
		try {
			FileInputStream fileIn = new FileInputStream("save");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			bd =  (BaseDonnees) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			System.out.println("File not found");
			return;
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
			return;
		}

	}

	public static void save() {
		ObjectOutputStream oos = null;
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("save");
			oos = new ObjectOutputStream(fout);
			oos.writeObject(bd);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
