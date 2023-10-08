public class Tomatoes extends FillingDecorator {
    public Tomatoes(iBurger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", tomatoes";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }
}
