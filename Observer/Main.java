public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer currentConditions = new CurrentConditionsDisplay();
        Observer forecast = new ForecastDisplay();
        Observer heatAlert = new HeatAlert(35.0);

        station.subscribe(currentConditions);
        station.subscribe(forecast);
        station.subscribe(heatAlert);

        station.setMeasurements(31.5, 70.0, 1012.0);
        station.setMeasurements(36.2, 65.0, 1008.0);

        System.out.println("\nThe heat-alert service unsubscribes.");
        station.unsubscribe(heatAlert);
        station.setMeasurements(37.0, 60.0, 1014.0);
    }
}
