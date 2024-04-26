package demo.serverRMI;

public class Compte {
    private Integer numCompte;
    private String nom;

    public  Compte(){}

    public Compte(Integer numCompte, String nom, Double solde) {
        this.numCompte = numCompte;
        this.nom = nom;
        Solde = solde;
    }

    public Integer getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(Integer numCompte) {
        this.numCompte = numCompte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getSolde() {
        return Solde;
    }

    public void setSolde(Double solde) {
        Solde = solde;
    }

    private Double Solde;


}
