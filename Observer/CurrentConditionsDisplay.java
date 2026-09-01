public class CurrentConditionsDisplay implements Observer {
    @Override
    public void update(WeatherData weatherData) {
        System.out.printf(
                "Current conditions: %.1f C and %.0f%% humidity.%n",
                weatherData.getTemperature(),
                weatherData.getHumidity()
        );
    }
}
