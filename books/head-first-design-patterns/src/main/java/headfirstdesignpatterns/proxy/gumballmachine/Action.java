package headfirstdesignpatterns.proxy.gumballmachine;

import java.io.Serializable;

enum Action implements Serializable {

    CANT_INSERT_ANOTHER_QUARTER("You can't insert another quarter"),
    INSERTED_QUARTER("You inserted a quarter"),
    SOLD_OUT("You can't insert a quarter, the machine is sold out"),
    WAIT_GIVING_QUARTER_NOW("Please wait, we're already giving you a quarter"),
    QUARTER_RETURNED("Quarter returned"),
    HAVE_NOT_INSERTED_QUARTER("You haven't inserted a quarter"),
    CAN_NOT_EJECT_NO_QUARTER_YET("You can's eject, you haven't inserted a quarter yet"),
    ALREADY_TURNED_ON_CRANK("Sorry, you already turned the crank"),
    YOU_TURNED("You turned..."),
    TURNED_NO_QUARTER("You turned, but there is no quarter"),
    TURNED_NO_GUMBALLS("You turned, but there are no gumballs"),
    GUMBALL_IS_COMING("A gumball comes rolling out the slot"),
    OUT_OF_GUMBALLS("Oops, out of gumballs"),
    PAY_FIRST("You need to pay first"),
    NO_GUMBALL_DISPENSED("No gumball dispensed"),
    REFILLED("Refilled"),
    WINNER("You are a winner! You got two gumballs for your quarter."),
    END("Unused");

    Action(String description) {
        this.description = description;
    }

    private final String description;

    public String getDescription() {
        return description;
    }
}
