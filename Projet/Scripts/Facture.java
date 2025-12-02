package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Facture {
    private int numFacture;
    private String nomClient;
    private Date dateEmission;
    private double montantTotal;
    private String statut;
    private List<LigneFacture> lignes;
    private static int compteurFacture = 1;

    public Facture(Reservation reservation) {
        this.numFacture = compteurFacture++;
        this.nomClient = reservation.getClient().getNom();
        this.dateEmission = new Date();
        this.statut = "NON_PAYEE";
        this.lignes = new ArrayList<>();


    }


}

