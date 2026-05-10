import java.rmi.*;
import java.rmi.registry.*;

public class Server {

    public static void main(String[] args) {

        try {

            PalindromeImpl obj = new PalindromeImpl();

            LocateRegistry.createRegistry(1099);

            Naming.rebind("rmi://localhost/PalindromeService", obj);

            System.out.println("Server is Ready...");

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
