package designpatterns.observer.weather;

/**
 *
 * @author user
 */
public interface WeatherEventListener {
    public void change(int[] measurements);
}
