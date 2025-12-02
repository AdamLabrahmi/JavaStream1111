package model;

import java.util.List;
import java.util.ArrayList;

class Receptionniste extends Personne {
    private String adresse;

    public Receptionniste(int id, String nom, String telephone, String adresse) {
        super(id, nom, telephone);
        this.adresse = adresse;
    }

    
}
