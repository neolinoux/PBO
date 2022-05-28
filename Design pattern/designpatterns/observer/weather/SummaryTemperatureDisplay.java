package designpatterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class SummaryTemperatureDisplay extends DisplayElement implements WeatherEventListener{

    private List<Integer> history;

    public SummaryTemperatureDisplay() {
        history = new ArrayList<>();
    }

    @Override
    public void change(int[] measurements) {
        history.add(measurements[0]);
    }

    @Override
    public void display() {
        System.out.println("Today temperature summary:");
        System.out.println("Min:"+minTemperature());
        System.out.println("Max:"+maxTemperature());
    }

    public int minTemperature() {
        int min = 100;
        for (Integer temp : history) {
            if (min > temp) {
                min = temp;
            }
        }
        return min;
    }

    public int maxTemperature(){
        int max = 0;
        for (Integer temp : history) {
            if(max<temp){
                max = temp;
            }
        }
        return max;
    }
    
}
