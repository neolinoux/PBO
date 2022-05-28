package designpatterns.observer.weather;


public class WeatherApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        SummaryTemperatureDisplay sumDisplay = new SummaryTemperatureDisplay();
        weatherData.subscribe(sumDisplay);
        CurrentTemperatureDisplay currDisplay = new CurrentTemperatureDisplay();
        weatherData.subscribe(currDisplay);
        WeatherDashboard dashboard = new WeatherDashboard(currDisplay, sumDisplay);
        weatherData.setMeasurements(24, 65, 30);
        dashboard.display();
        weatherData.setMeasurements(26, 70, 29);
        dashboard.display();
        weatherData.setMeasurements(32, 90, 29);
        dashboard.display();
    }
}
