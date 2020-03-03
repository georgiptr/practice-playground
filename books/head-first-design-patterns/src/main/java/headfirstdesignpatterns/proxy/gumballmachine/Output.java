package headfirstdesignpatterns.proxy.gumballmachine;

import java.io.Serializable;

interface Output extends Serializable {
    void write(Action action);
    void write(String message);
}
