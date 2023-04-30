package observer_pattern.code;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float tempreature;
    private float humidity; 
    private Subject weatherData; 

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float tempreature, float humidity, float pressure) {
        this.tempreature = tempreature; 
        this.humidity = humidity; 
        display();
    }
    public void display() {
        System.out.println("Current conditions: " + tempreature 
            + "F degreees and " + humidity + "% humidity");
    }
}
