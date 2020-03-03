package headfirstdesignpatterns.facade.appliances;

public class DvdPlayer {
    public void turnOn() {
        System.out.println("DVD Player turning on");
    }

    public void turnOff() {
        System.out.println("DVD Player turning off");
    }

    public void eject() {
        System.out.println("DVD Player ejecting");
    }

    public void play() {
        System.out.println("DVD Player playing");
    }

    public void stop() {
        System.out.println("DVD Player stopping");
    }
}
