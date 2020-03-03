package headfirstdesignpatterns.state.v2;

class SoldState implements State {

    private GumballMachine gumballMachine;
    private Output output;


    SoldState(GumballMachine gumballMachine, Output output) {
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
        if (gumballMachine.getGumBallsCount() == 0) {
            output.write(Action.OUT_OF_GUMBALLS);
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

    @Override
    public void refill() {

    }
}
