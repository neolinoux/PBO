package designpatterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    private List<WeatherEventListener> eventListener;
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData() {
        eventListener = new ArrayList<>();
    }

    public void subscribe(WeatherEventListener eventListener) {
        this.eventListener.add(eventListener);
    }

    public void unsubscribe(WeatherEventListener eventListener) {
        this.eventListener.remove(eventListener);
    }

    public void measurementsChanged() {
        for (WeatherEventListener event : eventListener) {
            event.change(new int[]{this.temperature, this.humidity, this.pressure});
        }
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
}
