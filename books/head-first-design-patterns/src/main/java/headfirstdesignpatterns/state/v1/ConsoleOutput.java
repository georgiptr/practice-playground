package headfirstdesignpatterns.state.v1;

class ConsoleOutput implements Output {

    @Override
    public void write(Action action) {
        System.out.println(action.getDescription());
    }
}
