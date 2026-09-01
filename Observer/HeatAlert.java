public class HeatAlert implements Observer {
    private final double warningTemperature;

    public HeatAlert(double warningTemperature) {
        this.warningTemperature = warningTemperature;
    }

    @Override
    public void update(WeatherData weatherData) {
        if (weatherData.getTemperature() >= warningTemperature) {
            System.out.printf(
                    "Heat alert: temperature reached %.1f C!%n",
                    weatherData.getTemperature()
            );
        }
    }
}
