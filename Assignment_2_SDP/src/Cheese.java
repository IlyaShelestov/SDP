public class Cheese extends FillingDecorator {
    public Cheese(iBurger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.4;
    }
}
