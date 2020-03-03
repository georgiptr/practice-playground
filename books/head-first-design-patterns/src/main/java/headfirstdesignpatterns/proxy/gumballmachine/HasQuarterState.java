package headfirstdesignpatterns.proxy.gumballmachine;

import java.util.Random;

public class HasQuarterState implements State {

    private Random randomWinner = new Random(System.currentTimeMillis());
    private static final long serialVersionUID = 2L;
    private transient GumballMachine gumballMachine;
    private transient Output output;

    HasQuarterState(GumballMachine gumballMachine, Output output) {
        this.gumballMachine = gumballMachine;
        this.output = output;
    }

    @Override
    public void insertQuarter() {
        output.write(Action.CANT_INSERT_ANOTHER_QUARTER);
    }

    @Override
    public void ejectQuarter() {
        output.write(Action.QUARTER_RETURNED);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        output.write(Action.YOU_TURNED);
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        output.write(Action.NO_GUMBALL_DISPENSED);
    }

    @Override
    public void refill() {

    }
}
