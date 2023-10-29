import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers(double temperature, double humidity, double pressure) {
        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

}
