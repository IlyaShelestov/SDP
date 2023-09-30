public class QuickSort implements SortingStrategy{
    private int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return (i + 1);
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            quickSort(arr, start, p - 1);
            quickSort(arr, p + 1, end);
        }
    }

    @Override
    public void sort(int[] data) {
        int size = data.length;
        quickSort(data, 0, size - 1);
    }

    @Override
    public void info() {
        System.out.println("Quicksort was developed by British computer scientist Tony Hoare in 1959 and published in 1961.");
    }

    @Override
    public void end() {
        System.out.println("Sorted with Quick sort.");
    }
}
