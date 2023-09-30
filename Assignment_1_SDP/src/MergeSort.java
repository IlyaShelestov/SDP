public class MergeSort implements SortingStrategy{
    void merge(int[] arr, int start, int mid, int end) {
        int i, j, k;
        int size1 = mid - start + 1;
        int size2 = end - mid;
        int[] LeftArray = new int[size1];
        int[] RightArray = new int[size2];
        for (i = 0; i < size1; i++)
            LeftArray[i] = arr[start + i];
        for (j = 0; j < size2; j++)
            RightArray[j] = arr[mid + 1 + j];
        i = 0;
        j = 0;
        k = start;
        while (i < size1 && j < size2) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            }
            else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j < size2) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    @Override
    public void sort(int[] data) {
        int size = data.length;
        mergeSort(data, 0, size - 1);
    }

    @Override
    public void info() {
        System.out.println("Created in 1945, John Von Neumann developed the merge sort algorithm using the divide-and-conquer approach.");
    }

    @Override
    public void end() {
        System.out.println("Sorted with Merge sort.");
    }
}
