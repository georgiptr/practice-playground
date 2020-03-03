package headfirstdesignpatterns.proxy.gumballmachine;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    /**
     * First start rmiregistry in head-first-design-patterns\out\production\classes
     * Then: java -cp . headfirstdesignpatterns.proxy.gumballmachine.GumballMachineTestDrive sofia 100
     * @param args
     */
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        Output console = new ConsoleOutput();
        int count;
        String location;

        if (args.length < 2) {
            console.write("GumballMachine <location> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            location = args[0];
            gumballMachine = new GumballMachine(location, count, console);
            Naming.bind(location, gumballMachine);
        } catch (RemoteException | AlreadyBoundException | MalformedURLException e) {
            console.write("Exception: " + e.getLocalizedMessage());
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
