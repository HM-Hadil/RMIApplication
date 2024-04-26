package demo.serverRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
// RMI ( remote Methode Invocation)
//appel des methodes a distance:  thrwos ex : peut etre prbl de cnx : repture serveur panne, leve l'exception de
// type RemoteException
public interface RMIInterface extends Remote {
    // les methodes de serveur qui peuvent etre invoquer a distance

    public Compte ConsulterCompte(Integer numCompte) throws RemoteException;
    public List<Compte> getListComptes() throws RemoteException;
    public Double convertirMontant(Double montantEnEuros ) throws RemoteException;
}
