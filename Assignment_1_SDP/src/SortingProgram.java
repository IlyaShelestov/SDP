public class SortingProgram {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void performSort(int[] data) {
        strategy.sort(data);
        strategy.end();
    }

    public void getInfo() {
        strategy.info();
    }

    public void processing() {
        System.out.println("Processing...");
    }
}
