package headfirstdesignpatterns.state.v1;

public class TestOutput implements Output {

    Action lastAction = Action.END;

    @Override
    public void write(Action action) {
        lastAction = action;
    }

    public Action getLastAction() {
        return lastAction;
    }
}
