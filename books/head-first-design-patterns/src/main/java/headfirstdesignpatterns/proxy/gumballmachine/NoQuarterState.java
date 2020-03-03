package headfirstdesignpatterns.proxy.gumballmachine;

public class NoQuarterState implements State {

    private static final long serialVersionUID = 2L;
    private transient GumballMachine gumballMachine;
    private transient Output output;

    NoQuarterState(GumballMachine gumballMachine, Output output) {
        this.gumballMachine = gumballMachine;
        this.output = output;
    }

    @Override
    public void insertQuarter() {
        output.write(Action.INSERTED_QUARTER);
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        output.write(Action.HAVE_NOT_INSERTED_QUARTER);
    }

    @Override
    public void turnCrank() {
        output.write(Action.TURNED_NO_QUARTER);
    }

    @Override
    public void dispense() {
        output.write(Action.PAY_FIRST);
    }

    @Override
    public void refill() {

    }
}
