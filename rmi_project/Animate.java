import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Animate extends Remote {
    void PrintMsg() throws RemoteException;
}

