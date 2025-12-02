package model;

class Client extends Personne {
    private String email;
    private int numChambre;


    public Client(int id, String nom, String telephone, String email, String adresse) {
        super(id, nom, telephone);
        this.email = email;
    }


}

