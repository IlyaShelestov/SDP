import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SortingProgram sortingProgram = new SortingProgram();
        Scanner scanner = new Scanner(System.in);
        int size;
        int methodNum;

        System.out.println("Welcome to the Sorting Program!");

        String choice;
        do {
            System.out.println("Please, enter the size of your array: ");
            size = scanner.nextInt();
            System.out.println("Size is " + size + ". Are you sure? y/n");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("n"));

        int[] arr = new int[size];

        do {
            System.out.println("Please, input array elements.");
            for (int i = 0; i < size; i++) {
                System.out.println(i + "/" + size);
                arr[i] = scanner.nextInt();
            }
            System.out.println("Array elements:");
            for (int e: arr) {
                System.out.print(e + " ");
            }
            System.out.println("\nAre you sure? y/n");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("n"));

        do {
            System.out.println("Please, choose sorting method: \n1 - Bubble Sort.\n2 - Merge Sort.\n3 - Quick Sort.");
            methodNum = scanner.nextInt();
            System.out.println("Your choice is " + methodNum + ". Are you sure? y/n");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("n"));

        if (methodNum == 1) {
            sortingProgram.setStrategy(new BubbleSort());
        }
        else if (methodNum == 2) {
            sortingProgram.setStrategy(new MergeSort());
        }
        else {
            sortingProgram.setStrategy(new QuickSort());
        }

        sortingProgram.processing();
        sortingProgram.performSort(arr);
        sortingProgram.getInfo();

        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nGoodbye!");
    }
}