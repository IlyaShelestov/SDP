public class WeatherApp {
    private final Publisher publisher;

    private double currentTemperature;
    private double currentHumidity;
    private double currentPressure;

    public WeatherApp(Publisher publisher) {
        this.publisher = publisher;
    }

    public void notifyObservers() {
        System.out.println("-------------------------------------------------");
        publisher.notifyObservers(currentTemperature, currentHumidity, currentPressure);
        System.out.println("-------------------------------------------------");
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        currentTemperature = temperature;
        currentHumidity = humidity;
        currentPressure = pressure;
        notifyObservers();
    }

    public void getMeasurements() {
        System.out.println("-------------------------------------------------");
        System.out.println("Temperature: " + currentTemperature + "C; Humidity: " + currentHumidity + "%; Pressure: " + currentPressure + "atm;");
        System.out.println("-------------------------------------------------");
    }
}
