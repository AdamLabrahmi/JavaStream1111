package JavaStream1111;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Client {
    private final int idClient;
    private final String nom;
    private final String adresse;
    private final double chiffreAffaire;

    public Client(int idClient, String nom, String adresse, double chiffreAffaire) {
        this.idClient = idClient;
        this.nom = nom;
        this.adresse = adresse;
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", chiffreAffaire=" + chiffreAffaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idClient == client.idClient && Double.compare(chiffreAffaire, client.chiffreAffaire) == 0 && Objects.equals(nom, client.nom) && Objects.equals(adresse, client.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, nom, adresse, chiffreAffaire);
    }

    public static List<Client> getClients() {
        return Arrays.asList(
                new Client(101, "Dupont", "Paris", 15000),
                new Client(106, "Adam", "Paris", 150000.00),
                new Client(102, "Martin", "Lyon", 320000.50),
                new Client(105, "Mart", "Lyon", 3200),
                new Client(103, "Bernard", "Toulouse", 98000.25),
                new Client(104, "Dubois", "Marseille", 1200000.75)
        );
    }

    public static void main(String[] args) {
        List<Client> clients = Client.getClients();

//        Exercice 1
        System.out.println("=== Clients residant a Lyon tries par chiffre d’affaire decroissant ===");
            clients.stream()
                    .filter(c->c.getAdresse().equalsIgnoreCase("Lyon"))
                    .sorted((c1,c2)->Double.compare(c2.getChiffreAffaire(),c1.getChiffreAffaire()))
                    .forEach(System.out::println);


//            Exercice 2
        System.out.println("=== Transformation en Map<Integer, String> (id -> nom) ===");
        Map<Integer,String> clientMap = clients.stream()
                .collect(Collectors.toMap(Client::getIdClient,Client::getNom));

        clientMap.forEach((i,n)->System.out.println("Id : "+i+" Nom : "+n));


//        Exercice 3

        System.out.println("=== Calcul du chiffre d’affaires total des clients de Paris ===");
            double totaleCA = clients.stream()
                    .filter(c->c.getAdresse().equalsIgnoreCase("Paris"))
                    .mapToDouble(Client::getChiffreAffaire).sum();

        System.out.println("Chiffre d’affaires total des clients de Paris : " + totaleCA + " DH");

//        Exercice 4
        System.out.println("=== Chiffre d’affaires moyen par ville ===");
        Map<String,Double> calculMoyenParVille = clients.stream()
                .collect(Collectors.groupingBy(Client::getAdresse,Collectors.averagingDouble(Client::getChiffreAffaire)));

        calculMoyenParVille.forEach((v,ca)->{
            System.out.println("Ville : " + v + " → CA moyen : " + ca + " DH");;
        });

//        Exercice 5

        System.out.println("=== Verification et Transformation ===");

        boolean tousClientSup = clients.stream()
                .allMatch(c->c.getChiffreAffaire() > 50000);

        if(tousClientSup){
            List<String> nomMajuscule = clients.stream()
                    .map(c->c.getNom().toUpperCase())
                    .collect(Collectors.toList());
            System.out.println("Tous les clients ont un CA > 50 000 ");
            System.out.println("Noms en majuscules : " + nomMajuscule);

        }
        else {
            System.out.println("Certains clients ont un CA ≤ 50 000");
        }
    }






}
