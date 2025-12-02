package model;

class Gestionnaire extends Personne {
    private String departement;

    public Gestionnaire(int id, String nom, String telephone, String departement) {
        super(id, nom, telephone);
        this.departement = departement;
    }


}
