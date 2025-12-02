package model;

class LigneFacture {
    private String description;
    private int quantite;
    private double prixUnitaire;

    public LigneFacture(String description, int quantite, double prixUnitaire) {
        this.description = description;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }


}
