package model;

import java.util.Date;

class Reservation {
    private int idReservation;
    private Date dateArrivee;
    private Date dateDepart;
    private int nombrePersonnes;
    private double montantTotal;
    private String statut;
    private Client client;
    private Chambre chambre;
    private static int compteurId = 1;

    public Reservation(Client client, Chambre chambre) {
        this.idReservation = compteurId++;
        this.client = client;
        this.chambre = chambre;
        this.dateArrivee = new Date();
        this.statut = "EN_ATTENTE";
    }

}
