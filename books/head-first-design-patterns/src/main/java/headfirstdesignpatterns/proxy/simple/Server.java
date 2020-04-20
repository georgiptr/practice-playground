package headfirstdesignpatterns.proxy.simple;

import java.rmi.Naming;

/**
 * Important! Before launching the server:
 * Open a console, enter build\classes\java\main and run "rmiregistry.exe".
 * Otherwise ClassNotFoundException is generated.
 */
public class Server {
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.bind("RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
