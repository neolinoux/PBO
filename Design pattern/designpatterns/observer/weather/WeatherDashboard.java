package designpatterns.observer.weather;

/**
 *
 * @author user
 */
public class WeatherDashboard extends DisplayElement{
    CurrentTemperatureDisplay currentTempDisplay;
    SummaryTemperatureDisplay summaryTempDisplay;

    public WeatherDashboard(CurrentTemperatureDisplay currentTempDisplay, SummaryTemperatureDisplay summaryTempDisplay) {
        this.currentTempDisplay = currentTempDisplay;
        this.summaryTempDisplay = summaryTempDisplay;
    }
    
    public void display(){
        System.out.println("Temperature Dashboard");
        currentTempDisplay.display();
        summaryTempDisplay.display();
    }
}
