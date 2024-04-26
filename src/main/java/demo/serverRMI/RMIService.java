package demo.serverRMI;

import java.util.ArrayList;
import java.util.List;

//les classes et inteface doit etre commun entre le serveur et le client
public class RMIService implements RMIInterface{
    private ArrayList<Compte> compte = new ArrayList<>();

    @Override
    public Compte ConsulterCompte(Integer numCompte) {
       // return compte.get(numCompte) ;
        for (Compte compte : compte) {
            if (compte.getNumCompte().equals(numCompte)) {
                return compte;
            }
        }
        return null; // Retourne null si le compte n'est pas trouvé
    }


    @Override
    public List<Compte> getListComptes() {
        return compte;
    }

    @Override
    public  Double convertirMontant(Double montantEnEuros ) {
        var tauxDeChange =1.8;

        // Conversion du montant en euros vers la devise cible
        return montantEnEuros * tauxDeChange;
    }
}
//objet a distance cote serveur => skeleuton