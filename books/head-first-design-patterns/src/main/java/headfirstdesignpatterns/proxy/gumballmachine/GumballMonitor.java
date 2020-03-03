package headfirstdesignpatterns.proxy.gumballmachine;

import java.rmi.RemoteException;

public class GumballMonitor {
    private transient GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report(Output output) {
        try {
            output.write("Gumball Machine: " + machine.getLocation());
            output.write("Current Inventory: " + machine.getCount() + " gumballs");
            output.write("Current State: " + machine.getState());
        } catch (RemoteException e) {
            output.write(e.getMessage());
        }

    }
}
