package headfirstdesignpatterns.facade.appliances;

public class CdPlayer {
    public void turnOn() {
        System.out.println("CD Player turning on");
    }

    public void turnOff() {
        System.out.println("CD Player turning off");
    }

    public void eject() {
        System.out.println("CD Player ejecting");
    }

    public void play() {
        System.out.println("CD Player playing");
    }

    public void stop() {
        System.out.println("CD Player stopping");
    }
}
