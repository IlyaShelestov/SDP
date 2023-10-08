public class Patty extends FillingDecorator {
    public Patty(iBurger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", patty";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.25;
    }
}
