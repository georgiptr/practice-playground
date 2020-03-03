package headfirstdesignpatterns.command;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RemoteControlTest {

    @Test
    public void testLightOnCommand() {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = mock(Light.class);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
        verify(light, Mockito.times(1)).on();
    }

    @Test
    public void testTwoCommands() {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = mock(Light.class);
        GarageDoor garageDoor = mock(GarageDoor.class);

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();


        verify(light, Mockito.times(1)).on();
        verify(garageDoor, Mockito.times(1)).open();
    }
}
