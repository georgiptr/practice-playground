package headfirstdesignpatterns.state.v1;

enum State {
    SOLD_OUT("State: Sold out"),
    NO_QUARTER("State: No quarter"),
    HAS_QUARTER("State: Has quarter"),
    SOLD("State: Sold"),
    END("Unused");

    State(String description) {
        this.description = description;
    }

    private final String description;

    public String getDescription() {
        return description;
    }
}
