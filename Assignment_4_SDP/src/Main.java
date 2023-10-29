public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        WeatherApp weatherApp = new WeatherApp(publisher);

        Display displayM = new Display("Main Display");
        Display displayS = new Display("Small Display");

        Speaker speaker = new Speaker("Speaker");

        PhoneMessage phone1 = new PhoneMessage("Phone");

        publisher.addObserver(displayM);
        publisher.addObserver(displayS);
        publisher.addObserver(speaker);
        publisher.addObserver(phone1);

        weatherApp.setMeasurements(25.3, 30.2, 10.15);
        weatherApp.setMeasurements(10.3, 22.1, 17.8);

        publisher.removeObserver(displayS);

        weatherApp.setMeasurements(17, 25.3, 14.0);
        weatherApp.getMeasurements();
    }
}