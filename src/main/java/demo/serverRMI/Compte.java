package demo.serverRMI;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;

    public  Compte(){}

    public Compte(int code, double solde, Date dateCreation) {
        super();
    }

    public Integer getNumCompte() {
        return code;
    }

    public void setNumCompte(Integer numCompte) {
        this.code = numCompte;
    }



    public Double getSolde() {
        return Solde;
    }

    public void setSolde(Double solde) {
        Solde = solde;
    }

    private Double Solde;


}
