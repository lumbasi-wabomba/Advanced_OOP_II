import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class ProductImpl extends UnicastRemoteObject implements Product {
    private String name;
    private double price;

    public ProductImpl(String name, double price) throws RemoteException {
        this.name = name;
        this.price = price;
    }

    public String getName() throws RemoteException {
        return name;
    }

    public double getPrice() throws RemoteException {
        return price;
    }
}
