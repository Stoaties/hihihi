package src;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;

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
      //  messages.add(new Message(e, message, new Timestamp(System.currentTimeMillis()));
    }

    public Message getMessage(int index) {
        return messages.get(index);
    }

    public boolean deleteMessagesFrom() {
    	return true;
    }
    
}
