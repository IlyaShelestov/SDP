public class PhoneMessage implements Observer{
    String name;

    public PhoneMessage(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println(name + " shows: current temperature is " + temperature + "C, current humidity is " + humidity + "%, current pressure is " + pressure + "atm.");
    }
}
