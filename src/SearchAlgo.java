import java.util.Scanner;

public class SearchAlgo {
    public static void searchMenu() {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("What search algorithm would you like to see?");
        System.out.println("1. Linear Search");
        //System.out.println("2. Binary Search");
        //System.out.println("3. Depth First Search");
        //System.out.println("4. Breadth First Search\n");

        choice = sc.nextInt(); //Store selected menu choice

        //Direct user to proper page or submenu
        if (choice == 1) {
            SearchAlgo.linearSearchText();
        } else {
            System.out.println("Please choose a valid option!");
            SearchAlgo.searchMenu();
        }

        Algorithms.repeat();
    }
    public static void linearSearchText() {
        String[] args={};
        System.out.println("*** Brief Explanation ***\n" +
                "Linear Search is a sequential search algorithm that starts\n" +
                "at one end and goes through each element of the list until the desired element is found.\n" +
                "It is the easiest search algorithm with an O(N) complexity.\n" +
                "*** Pseudocode ***\n" +
                "Start from the leftmost element of arr[] and one by one compare x with each element of arr[]\n" +
                "If x matches with an element, return the index.\n" +
                "If x doesn’t match with any of the elements, return -1.\n" +
                "*** Quick Sort Output ***\n");
        LinearSearch.main(args);//execute linear search
        System.out.println("*** Reference ***\n" +
                "https://www.geeksforgeeks.org/linear-search/");
    }
}
