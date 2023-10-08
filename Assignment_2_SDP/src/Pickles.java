public class Pickles extends FillingDecorator {
    public Pickles(iBurger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pickles";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.15;
    }
}
