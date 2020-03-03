package headfirstdesignpatterns.proxy.gumballmachine;

public class WinnerState implements State {

    private static final long serialVersionUID = 2L;
    private transient GumballMachine gumballMachine;
    private transient Output output;


    WinnerState(GumballMachine gumballMachine, Output output) {
        this.gumballMachine = gumballMachine;
        this.output = output;
    }

    @Override
    public void insertQuarter() {
        output.write(Action.WAIT_GIVING_QUARTER_NOW);
    }

    @Override
    public void ejectQuarter() {
        output.write(Action.ALREADY_TURNED_ON_CRANK);
    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            output.write(Action.WINNER);
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                output.write(Action.OUT_OF_GUMBALLS);
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {

    }
}
