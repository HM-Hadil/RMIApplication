package demo.serverRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws RemoteException {
        try{
        LocateRegistry.createRegistry(1099);
        /**
         *  Solution 1 : Objet skeleton de la classe service implémentation
         * qui hérite de la classe UnicastRemoteObject*/
        RMIService od= new RMIService();

        System.out.print(od.toString());

        /**
         * Solution 2 : Objet skeleton sans hériter de la classe
         * UnicastRemoteObject
         * ServiceImplementation od= new ServiceImplementation();
         * Remote skeleton= UnicastRemoteObject.exportObject(od);
         * */

        try {
              //Publier la référence de l’objet distant dans l’annuaire avec le nom BK
            Naming.rebind("rmi://localhost:1099/BK", od);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    } catch (RemoteException e) {
// TODO Auto-generated catch block
        e.printStackTrace();
    }
}

}