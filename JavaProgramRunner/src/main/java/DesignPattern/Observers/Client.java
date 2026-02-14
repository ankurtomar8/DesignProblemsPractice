package DesignPattern.Observers;

public class Client {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        weatherData.setMeasurements(10.f, 20.f, 30.f);

        weatherData.registerObserver(new CurrentStatDisplay());
        weatherData.registerObserver(new AverageStatsDisplay());
        weatherData.registerObserver(new ForecastDisplay());

        weatherData.setMeasurements(20.f, 30.f, 40.f);


    }
}
