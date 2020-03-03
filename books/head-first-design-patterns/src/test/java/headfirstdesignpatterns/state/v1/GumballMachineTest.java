package headfirstdesignpatterns.state.v1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class GumballMachineTest {

    @Test
    public void test() {
        TestOutput output = new TestOutput();

        GumballMachine gumballMachine = new GumballMachine(5, output);
        assertEquals(State.NO_QUARTER, gumballMachine.getState());
        assertEquals(5, gumballMachine.getGumBallsCount());

        gumballMachine.insertQuarter();
        assertEquals(Action.INSERTED_QUARTER, output.getLastAction());

        gumballMachine.turnCrank();
        assertEquals(Action.GUMBALL_IS_COMING, output.getLastAction());
        assertEquals(State.NO_QUARTER, gumballMachine.getState());
        assertEquals(4, gumballMachine.getGumBallsCount());

        gumballMachine.insertQuarter();
        assertEquals(Action.INSERTED_QUARTER, output.getLastAction());

        gumballMachine.ejectQuarter();
        assertEquals(Action.QUARTER_RETURNED, output.getLastAction());

        gumballMachine.turnCrank();
        assertEquals(Action.TURNED_NO_QUARTER, output.getLastAction());

        assertEquals(State.NO_QUARTER, gumballMachine.getState());
        assertEquals(4, gumballMachine.getGumBallsCount());

        gumballMachine.insertQuarter();
        assertEquals(Action.INSERTED_QUARTER, output.getLastAction());

        gumballMachine.turnCrank();
        assertEquals(Action.GUMBALL_IS_COMING, output.getLastAction());

        gumballMachine.insertQuarter();
        assertEquals(Action.INSERTED_QUARTER, output.getLastAction());

        gumballMachine.turnCrank();
        assertEquals(Action.GUMBALL_IS_COMING, output.getLastAction());

        gumballMachine.ejectQuarter();
        assertEquals(Action.HAVE_NOT_INSERTED_QUARTER, output.getLastAction());

        assertEquals(State.NO_QUARTER, gumballMachine.getState());
        assertEquals(2, gumballMachine.getGumBallsCount());

        gumballMachine.insertQuarter();
        assertEquals(Action.INSERTED_QUARTER, output.getLastAction());

        gumballMachine.insertQuarter();
        assertEquals(Action.CANT_INSERT_ANOTHER_QUARTER, output.getLastAction());

        gumballMachine.turnCrank();
        assertEquals(Action.GUMBALL_IS_COMING, output.getLastAction());

        gumballMachine.insertQuarter();
        assertEquals(Action.INSERTED_QUARTER, output.getLastAction());

        gumballMachine.turnCrank();
        assertEquals(Action.OUT_OF_GUMBALLS, output.getLastAction());

        gumballMachine.insertQuarter();
        assertEquals(Action.SOLD_OUT, output.getLastAction());

        gumballMachine.turnCrank();
        assertEquals(Action.TURNED_NO_GUMBALLS, output.getLastAction());

        assertEquals(State.SOLD_OUT, gumballMachine.getState());
        assertEquals(0, gumballMachine.getGumBallsCount());

        gumballMachine.refill(6);
        assertEquals(State.NO_QUARTER, gumballMachine.getState());
        assertEquals(6, gumballMachine.getGumBallsCount());
    }
}
