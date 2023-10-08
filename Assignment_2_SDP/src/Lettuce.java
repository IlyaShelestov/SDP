public class Lettuce extends FillingDecorator {
    public Lettuce(iBurger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", lettuce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }
}
