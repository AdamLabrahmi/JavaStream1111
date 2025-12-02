package model;

class Inventaire {
    private int idArticle;
    private String type;
    private int quantite;
    private static int compteurArticle = 1;

    public Inventaire(String type, int quantite) {
        this.idArticle = compteurArticle++;
        this.type = type;
        this.quantite = quantite;
    }


}
