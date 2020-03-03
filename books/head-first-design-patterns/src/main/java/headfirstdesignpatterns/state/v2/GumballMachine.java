package headfirstdesignpatterns.state.v2;

class GumballMachine {

    private Output output;

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state;
    private int numberGumballs = 0;

    public GumballMachine(int numberGumballs, Output output) {
        this.output = output;
        this.numberGumballs = numberGumballs;

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

    // Visible for testing
    State getState() {
        return state;
    }

    int getGumBallsCount() {
        return numberGumballs;
    }

    public void setGumballs(int numberGumballs) {
        this.numberGumballs = numberGumballs;
    }
}
