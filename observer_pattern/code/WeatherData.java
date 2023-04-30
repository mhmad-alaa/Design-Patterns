package observer_pattern.code;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature; 
    private float humidity; 
    private float pressure; 

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        int idx = observers.indexOf(o); 
        try {
            observers.remove(idx);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); ++i) {
            Observer observer = (Observer) observers.get(i); 
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged() {
        notifyObserver();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature; 
        this.humidity = humidity; 
        this.pressure = pressure;
    }
}
