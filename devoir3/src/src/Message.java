package src;

import java.io.Serializable;
import java.sql.Timestamp;

public class Message implements Serializable {
    private Etudiant envoyeur;
    private String message;
    private Timestamp dateEnvoie;

    public Message(Etudiant envoyeur, String message, Timestamp dateEnvoie) {
        this.envoyeur = envoyeur;
        this.message = message;
        this.dateEnvoie = dateEnvoie;
    }


}

