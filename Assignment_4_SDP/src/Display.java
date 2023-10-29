public class Display implements Observer{
    String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println(name + " prints: current temperature is " + temperature + "C, current humidity is " + humidity + "%, current pressure is " + pressure + "atm.");
    }
}
