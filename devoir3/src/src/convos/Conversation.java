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

    public void addMessage(Etudiant e, String message) {
        if(participants.contains(e))
            messages.add(new Message(e, message, new Timestamp(System.currentTimeMillis())));
    }

    public boolean removeMessage(int index) {
        if(checkIndex(index))
            messages.get(index).supprimerContenu();

        return checkIndex(index);
    }

    public Message getMessage(int index) {
        return checkIndex(index) ? messages.get(index) : null;
    }

    public boolean purgeStudent(Etudiant e) {
        for(Message m : messages) {
            if(m.getEnvoyeur() == e)
                m.purge();
        }

        return removeEtudiant(e);
    }


    public boolean checkIndex(int index) {
        return index >= 0 && index <= messages.size();
    }
}
