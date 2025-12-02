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

    public void confirmer() {
        this.statut = "CONFIRMEE";
        System.out.println("Réservation " + idReservation + " confirmée");
    }

    public void annuler() {
        this.statut = "ANNULEE";
        chambre.mettreAJour("DISPONIBLE");
        System.out.println("Réservation " + idReservation + " annulée");
    }

    public double calculerTotal() {
        // Calculer le nombre de nuits
        long diff = dateDepart.getTime() - dateArrivee.getTime();
        int nbNuits = (int) (diff / (1000 * 60 * 60 * 24));
        this.montantTotal = nbNuits * chambre.getPrixParNuit();
        return montantTotal;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public Client getClient() {
        return client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public double getMontantTotal() {
        return montantTotal;
    }
}
