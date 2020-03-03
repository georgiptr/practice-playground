package headfirstdesignpatterns.proxy.simple;

import java.rmi.Naming;

/**
 * Important! Run rmiregistry from folder head-first-design-patterns\out\production\classes!!!
 * Otherwise ClassNotFoundException is generated.
 */
public class Server {
    public static void main(String args[]) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.bind("RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
