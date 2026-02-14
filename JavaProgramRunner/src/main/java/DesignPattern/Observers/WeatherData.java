package DesignPattern.Observers;

import java.util.ArrayList;

public class WeatherData  implements Subject {
    private float temp;
    private float humidity;
    private float pressure;

    private ArrayList<Observer> observers;
    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
       this.temp = temperature;
       this.humidity = humidity;
       this.pressure = pressure;
        System.out.println("Weather Data Updated");
        notifyObservers();
    }


}
