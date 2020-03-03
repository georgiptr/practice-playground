package headfirstdesignpatterns.state.v2;

import java.util.Random;

class HasQuarterState implements State {

    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine gumballMachine;
    private Output output;

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
        if (winner == 0 && gumballMachine.getGumBallsCount() > 1) {
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
