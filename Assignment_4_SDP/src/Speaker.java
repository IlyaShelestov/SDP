public class Speaker implements Observer{
    String name;

    public Speaker(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println(name + " says: current temperature is " + temperature + "C, current humidity is " + humidity + "%, current pressure is " + pressure + "atm.");
    }
}
