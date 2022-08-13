import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class rmiClient {
    public static void main(String[] args) throws Exception {
        rmiServer.IRemoteHelloWorld hello = (rmiServer.IRemoteHelloWorld) Naming.lookup("rmi://127.0.0.1:1099/Hello");
        String ret = hello.hello();
        System.out.println(ret);
    }
}