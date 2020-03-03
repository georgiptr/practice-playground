package headfirstdesignpatterns.state.v1;

class GumballMachine {

    private Output output;

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int numberGumballs = 0;

    public GumballMachine(int numberGumballs, Output output) {
        this.output = output;
        this.numberGumballs = numberGumballs;
        if (numberGumballs > 0) {
            state = NO_QUARTER;
        }
    }

    public void refill(int count) {
        if (state == SOLD_OUT) {
            state = NO_QUARTER;
        }
        this.numberGumballs += count;
        output.write(Action.REFILLED);
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            output.write(Action.CANT_INSERT_ANOTHER_QUARTER);
        } else if (state == NO_QUARTER) {
            output.write(Action.INSERTED_QUARTER);
            state = HAS_QUARTER;
        } else if (state == SOLD_OUT) {
            output.write(Action.SOLD_OUT);
        } else if (state == SOLD) {
            output.write(Action.WAIT_GIVING_QUARTER_NOW);
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            output.write(Action.QUARTER_RETURNED);
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            output.write(Action.HAVE_NOT_INSERTED_QUARTER);
        } else if (state == SOLD_OUT) {
            output.write(Action.CAN_NOT_EJECT_NO_QUARTER_YET);
        } else if (state == SOLD) {
            output.write(Action.ALREADY_TURNED_ON_CRANK);
        }
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            output.write(Action.YOU_TURNED);
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            output.write(Action.TURNED_NO_QUARTER);
        } else if (state == SOLD_OUT) {
            output.write(Action.TURNED_NO_GUMBALLS);
        } else if (state == SOLD) {
            //
        }
    }

    public void dispense() {
        if (state == HAS_QUARTER) {
            output.write(Action.NO_GUMBALL_DISPENSED);
        } else if (state == NO_QUARTER) {
            output.write(Action.PAY_FIRST);
        } else if (state == SOLD_OUT) {
            output.write(Action.NO_GUMBALL_DISPENSED);
        } else if (state == SOLD) {
            output.write(Action.GUMBALL_IS_COMING);
            numberGumballs--;
            if (numberGumballs == 0) {
                output.write(Action.OUT_OF_GUMBALLS);
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }
    }

    // Visible for testing
    State getState() {
        if (state == SOLD_OUT) return State.SOLD_OUT;
        else if (state == NO_QUARTER) return State.NO_QUARTER;
        else if (state == HAS_QUARTER) return State.HAS_QUARTER;
        else if (state == SOLD) return State.SOLD;
        else return State.END;
    }

    // Visible for testing
    int getGumBallsCount() {
        return numberGumballs;
    }

}
