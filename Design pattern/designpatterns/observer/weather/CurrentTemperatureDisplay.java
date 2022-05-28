package designpatterns.observer.weather;

/**
 *
 * @author user
 */
public class CurrentTemperatureDisplay extends DisplayElement implements WeatherEventListener{

    private int temperature;
    
    @Override
    public void change(int[] measurements) {
        this.temperature = measurements[0];
    }

    @Override
    public void display() {
        System.out.println("Current temperature: "+temperature);
    }
    
}
