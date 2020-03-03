package headfirstdesignpatterns.facade.appliances;

public class Amp {
    public void turnOn() {
        System.out.println("Amp turning on");
    }

    public void turnOff() {
        System.out.println("Amp turning off");
    }

    public void setVolume(int percentage) {
        System.out.println("Amp setting volume to " + percentage +"%");
    }

    public void setCd() {
        System.out.println("Amp selecting CD");
    }

    public void setDvd() {
        System.out.println("Amp selecting TV");
    }


}
