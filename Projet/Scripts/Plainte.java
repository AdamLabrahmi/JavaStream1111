package model;

import java.util.Date;

class Plainte {
    private int idPlainte;
    private String description;
    private Date date;
    private String statut;
    private static int compteurPlainte = 1;

    public Plainte(String description) {
        this.idPlainte = compteurPlainte++;
        this.description = description;
        this.date = new Date();
        this.statut = "EN_COURS";
    }


}
