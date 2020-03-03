package headfirstdesignpatterns.observer.v1.displays;

import headfirstdesignpatterns.observer.v1.DisplayElement;
import headfirstdesignpatterns.observer.v1.Observer;
import headfirstdesignpatterns.observer.v1.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index: " + (temperature + humidity)); // Formula skipped
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
