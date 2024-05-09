package demo.serverRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//les classes et inteface doit etre commun entre le serveur et le client
public class RMIService extends UnicastRemoteObject implements RMIInterface{

    protected RMIService() throws RemoteException {
    }

    @Override
    public Compte ConsulterCompte(Integer numCompte) {
       // return compte.get(numCompte) ;
        Compte cpt=new Compte(numCompte, 1400, new Date());
        return cpt; // Retourne null si le compte n'est pas trouvé
    }


    @Override
    public List<Compte> getListComptes() throws RemoteException {
        System.out.println("Consultation des comptes");
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1, 1400, new Date()));
        comptes.add(new Compte(2, 12450, new Date()));
        comptes.add(new Compte(3, 15780, new Date()));
        
        return comptes;
    }


    @Override
    public  Double convertirMontant(Double mt ) {
        System.out.println("Conversation du montant "+mt);
        return mt*3.5;

    }
}
//objet a distance cote serveur => skeleuton