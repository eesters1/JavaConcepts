import java.util.Scanner;

public class SortAlgo {
    public static void sortMenu() {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("What Sort algorithm would you like to see?");
        System.out.println("1. Quick Sort");
        //System.out.println("2. Merge Sort");
        //System.out.println("3. Bubble Sort");
        //System.out.println("4. Selection Sort");
        //System.out.println("5. Insertion Sort\n");

        choice = sc.nextInt(); //Store selected menu choice

        //Direct user to proper page or submenu
        if (choice == 1) {
            SortAlgo.quickSortText();
        } else {
            System.out.println("Please choose a valid option!");
            SortAlgo.sortMenu();
        }

        Algorithms.repeat();
    }
    public static void quickSortText() {
        String[] args={};
        System.out.println("*** Brief Explanation ***\n" +
                "Quick Sort leverages the divide and conquer principle.\n" +
                "It has an average O(n log n) complexity\n" +
                "It is one of the most used sorting algorithms, especially for big data volumes.\n" +
                "*** Psedocode ***\n" +
                "//pseudocode for quick sort main algorithm\n" +
                "procedure quickSort(arr[], low, high)\n" +
                "    arr = list to be sorted\n" +
                "    low – first element of the array\n" +
                "    high – last element of array\n" +
                "begin\n" +
                "    if (low < high)\n" +
                "    {\n" +
                "       // pivot – pivot element around which array will be partitioned \n" +
                "        pivot = partition(arr, low, high);\n" +
                "        quickSort(arr, low, pivot - 1);  // call quicksort recursively to sort sub array before pivot\n" +
                "        quickSort(arr, pivot + 1, high); // call quicksort recursively to sort sub array after pivot\n" +
                "    }\n" +
                "end procedure\n" +
                " \n" +
                "//partition routine selects and places the pivot element into its proper position that will partition the array. \n" +
                "//Here, the pivot selected is the last element of the array\n" +
                "procedure partition (arr[], low, high)\n" +
                "begin\n" +
                "    // pivot (Element to be placed at right position)\n" +
                "    pivot = arr[high];  \n" +
                "     i = (low - 1)  // Index of smaller element\n" +
                "    for j = low to high\n" +
                "    {\n" +
                "        if (arr[j] <= pivot)\n" +
                "        {\n" +
                "            i++;    // increment index of smaller element\n" +
                "            swap arr[i] and arr[j]\n" +
                "        }\n" +
                "    }\n" +
                "    swap arr[i + 1] and arr[high])\n" +
                "    return (i + 1)\n" +
                "end procedure\n" +
                "*** Quick Sort Output ***\n");
        quickSortMain.main(args);
    }
}
