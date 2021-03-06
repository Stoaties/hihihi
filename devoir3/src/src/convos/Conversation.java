package src.convos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;

import src.Etudiant;

public class Conversation implements Serializable {
    private ArrayList<Message> messages;
    private ArrayList<Etudiant> participants;
    private String nom;

    public Conversation(ArrayList<Etudiant> participants, String nom) {
        this.participants = participants;
        this.nom = nom;

        messages = new ArrayList<>();
    }

    public boolean addEtudiant(Etudiant e) {
        boolean present = participants.contains(e);

        if(!present)
            participants.add(e);

        return !present;
    }

    public boolean removeEtudiant(Etudiant e) {
        boolean present = participants.contains(e);

        if(present)
            participants.remove(e);

        return present;
    }

    public Message getMessage(int index) {
        return checkIndex(index) ? messages.get(index) : null;
    }

    public void addMessage(Etudiant e, String message) {
        if(participants.contains(e))
            messages.add(new Message(e, message, new Timestamp(System.currentTimeMillis())));
    }

    public boolean removeMessage(int index) {
        if(checkIndex(index))
            messages.get(index).supprimerContenu();

        return checkIndex(index);
    }

    //Enleve tout les messages composes par un etudiant dans la conversation
    public boolean purgeStudent(Etudiant e) {
        for(Message m : messages) {
            if(m.getEnvoyeur() == e)
                m.purge();
        }

        return removeEtudiant(e);
    }

    //Valide si un index est situe dans l'intervalle des messages
    public boolean checkIndex(int index) {
        return index >= 0 && index <= messages.size();
    }

    public String toString() {
        StringBuilder total = new StringBuilder();
        for(Message m : messages) {
            total.append(m.toString()).append("\n");
        }

        return total.toString();
    }
}
