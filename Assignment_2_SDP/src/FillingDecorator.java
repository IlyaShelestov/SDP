public abstract class FillingDecorator implements iBurger {
    iBurger iBurger;

    public FillingDecorator(iBurger burger) {
        this.iBurger = burger;
    }

    @Override
    public String getDescription() {
        return iBurger.getDescription();
    }

    @Override
    public double getCost() {
        return iBurger.getCost();
    }
}
