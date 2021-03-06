package src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import src.ecole.Ecole;

public class BaseDonnees implements Serializable {
	private static List<Etudiant> etudiants = new ArrayList<Etudiant>();
	private static List<Ecole> ecoles = new ArrayList<Ecole>();
	
	public static void main(String[] args) {
		init();
		System.out.println(etudiants.get(0).getNom()+" "+etudiants.get(0).getPrenom());
		
		//Ecole ecole = new Ecole("UdeM");
		//etudiants.get(0).setEcole(ecole);
		//etudiants.add(new Etudiant("Corentin", "Gouanvic"));
		
		save();
	}

	public static void init() {
		try {
			FileInputStream fileIn = new FileInputStream("save");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			etudiants = (List<Etudiant>) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
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
			oos.writeObject(etudiants);
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
