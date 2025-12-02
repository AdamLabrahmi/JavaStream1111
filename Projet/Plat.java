package model;

class Plat {
    private int idPlat;
    private String nom;
    private double prix;
    private String categorie;
    private static int compteurPlat = 1;

    public Plat(String nom, double prix, String categorie) {
        this.idPlat = compteurPlat++;
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }


}
