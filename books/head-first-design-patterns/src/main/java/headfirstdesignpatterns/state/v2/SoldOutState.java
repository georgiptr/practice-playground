package headfirstdesignpatterns.state.v2;

class SoldOutState implements State {

    private GumballMachine gumballMachine;
    private Output output;


    SoldOutState(GumballMachine gumballMachine, Output output) {
        this.gumballMachine = gumballMachine;
        this.output = output;
    }

    @Override
    public void insertQuarter() {
        output.write(Action.SOLD_OUT);
    }

    @Override
    public void ejectQuarter() {
        output.write(Action.CAN_NOT_EJECT_NO_QUARTER_YET);
    }

    @Override
    public void turnCrank() {
        output.write(Action.TURNED_NO_GUMBALLS);
    }

    @Override
    public void dispense() {
        output.write(Action.NO_GUMBALL_DISPENSED);
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
