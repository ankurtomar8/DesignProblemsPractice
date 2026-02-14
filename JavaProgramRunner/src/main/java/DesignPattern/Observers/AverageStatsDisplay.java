package DesignPattern.Observers;

public class AverageStatsDisplay implements Observer, Display{

    private float temp ;
    private float humidity;
    private float pressure;


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Average Stats Display"+temp+"\t"+humidity+"\t"+pressure);
    }
}
