import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ImplExample {
    public Server() {}

    public static void main(String[] args) {
        ImplExample obj = new ImplExample();
        try {
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) { 
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
