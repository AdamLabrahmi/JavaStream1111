package model;

class Chambre {
    private int numChambre;
    private String localisation;
    private String type;
    private String statut;
    private double prixParNuit;

    public Chambre(int numChambre, String localisation, String type, double prixParNuit) {
        this.numChambre = numChambre;
        this.localisation = localisation;
        this.type = type;
        this.prixParNuit = prixParNuit;
        this.statut = "DISPONIBLE";
    }


}
