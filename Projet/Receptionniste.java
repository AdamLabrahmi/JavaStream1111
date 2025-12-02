package model;

import java.util.List;
import java.util.ArrayList;

class Receptionniste extends Personne {
    private String adresse;

    public Receptionniste(int id, String nom, String telephone, String adresse) {
        super(id, nom, telephone);
        this.adresse = adresse;
    }

    public List<Chambre> verifierDisponibilite() {
        List<Chambre> chambresDisponibles = new ArrayList<>();
        // Logique pour vérifier les chambres disponibles
        return chambresDisponibles;
    }

    public Reservation reserverChambre(Client client, Chambre chambre) {
        Reservation reservation = new Reservation(client, chambre);
        System.out.println("Chambre réservée pour " + client.getNom());
        return reservation;
    }

    public Facture genererFacture(Reservation reservation) {
        Facture facture = new Facture(reservation);
        System.out.println("Facture générée");
        return facture;
    }

    public String getAdresse() {
        return adresse;
    }
}
