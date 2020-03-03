package headfirstdesignpatterns.proxy.gumballmachine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private transient Output output;

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state;
    private int numberGumballs = 0;
    private String location;

    public GumballMachine(String location, int numberGumballs, Output output) throws RemoteException {
        this.output = output;
        this.numberGumballs = numberGumballs;
        this.location = location;

        soldOutState = new SoldOutState(this, output);
        noQuarterState = new NoQuarterState(this, output);
        hasQuarterState = new HasQuarterState(this, output);
        soldState = new SoldState(this, output);

        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldState;
        }
    }

    public void refill(int count) {
        this.numberGumballs += count;
        output.write(Action.REFILLED);
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        output.write(Action.GUMBALL_IS_COMING);
        if (numberGumballs != 0) {
            numberGumballs--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public int getCount() {
        return numberGumballs;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public State getState() {
        return state;
    }

    public void setGumballs(int numberGumballs) {
        this.numberGumballs = numberGumballs;
    }
}
