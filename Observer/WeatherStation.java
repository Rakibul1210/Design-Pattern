import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherStation implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private WeatherData latestWeather;

    @Override
    public void subscribe(Observer observer) {
        Observer validObserver = Objects.requireNonNull(observer);

        if (!observers.contains(validObserver)) {
            observers.add(validObserver);
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (latestWeather == null) {
            return;
        }

        for (Observer observer : new ArrayList<>(observers)) {
            observer.update(latestWeather);
        }
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        latestWeather = new WeatherData(temperature, humidity, pressure);
        System.out.println("\nWeather station received new measurements:");
        notifyObservers();
    }
}
