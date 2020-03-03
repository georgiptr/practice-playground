package headfirstdesignpatterns.proxy.gumballmachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://127.0.0.1/sofia",
                "rmi://127.0.0.1/plovdiv",
                "rmi://127.0.0.1/varna"};

        GumballMonitor[] monitor = new GumballMonitor[location.length];
        Output console = new ConsoleOutput();

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                if (machine != null) {
                    monitor[i] = new GumballMonitor(machine);
                }
            } catch (RemoteException | NotBoundException | MalformedURLException e) {
                console.write("Exception: " + e.getMessage());
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            if (monitor[i] != null) {
                monitor[i].report(console);
            }
        }

    }

    private static class ConsoleOutput implements Output {
        private static final long serialVersionUID = 2L;

        @Override
        public void write(Action action) {
            System.out.println(action.getDescription());
        }

        @Override
        public void write(String message) {
            System.out.println(message);
        }
    }
}
