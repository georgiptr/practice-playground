package headfirstdesignpatterns.proxy.simple;

import java.rmi.Naming;

public class Client {
    public static void main(String args[]) {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            System.out.println(service.sayHello());
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
