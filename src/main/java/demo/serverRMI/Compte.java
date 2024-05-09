package demo.serverRMI;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
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

    public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	private Double Solde;


}
