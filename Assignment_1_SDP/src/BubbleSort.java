public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] data) {
        int size = data.length;
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (data[j-1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    @Override
    public void info() {
        System.out.println("The earliest description of the Bubble sort algorithm was in a 1956 paper by mathematician and actuary Edward Harry Friend.");
    }

    @Override
    public void end() {
        System.out.println("Sorted with Bubble sort.");
    }
}
