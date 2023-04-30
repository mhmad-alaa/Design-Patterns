package observer_pattern.code;

public interface Subject {
    public void registerObserver(Observer o); 
    public void removeObserver(Observer o); 
    public void notifyObserver();
}