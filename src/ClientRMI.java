import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {

    public static void main(String[] args) {
      try{
          Registry rg = LocateRegistry.getRegistry(1099);

          ICalculateur stub =(ICalculateur) rg.lookup("calc");

          int resultat = stub.add(25,6);
          System.out.println("le resutat de la addition est : " + resultat);

      }catch (Exception e){
            e.printStackTrace();
      }

    }
}
