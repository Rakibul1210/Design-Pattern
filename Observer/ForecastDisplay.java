public class ForecastDisplay implements Observer {
    private Double previousPressure;

    @Override
    public void update(WeatherData weatherData) {
        double currentPressure = weatherData.getPressure();
        String forecast;

        if (previousPressure == null) {
            forecast = "More data is needed for a forecast.";
        } else if (currentPressure > previousPressure) {
            forecast = "Improving weather is expected.";
        } else if (currentPressure < previousPressure) {
            forecast = "Rainy weather may be on the way.";
        } else {
            forecast = "Conditions should remain stable.";
        }

        previousPressure = currentPressure;
        System.out.println("Forecast: " + forecast);
    }
}
