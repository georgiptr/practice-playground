package headfirstdesignpatterns.observer.v2;

import headfirstdesignpatterns.observer.v2.displays.CurrentConditionsDisplay;
import headfirstdesignpatterns.observer.v2.displays.HeatIndexDisplay;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void playgroundTest() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(30, 50, 100);
    }
}
