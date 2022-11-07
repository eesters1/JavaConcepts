import java.util.Scanner;
public class ArrayAlgo {
    public static void arrayMenu() {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("What array algorithm would you like to see?");
        System.out.println("1. Kadane's");
        //System.out.println("2. Floyd's Cycle Detection");
        //System.out.println("3. KMP");
        //System.out.println("4. Quick Select");
        //System.out.println("5. Boyer - More Majority Vote\n");

        choice = sc.nextInt(); //Store selected menu choice

        //Direct user to proper page or submenu
        if (choice == 1) {
            ArrayAlgo.kandanesText();
        } else {
            System.out.println("Please choose a valid option!");
            ArrayAlgo.arrayMenu();
        }

        Algorithms.repeat();
    }

    public static void kandanesText() {
        String[] args={};
        System.out.println("*** Brief Explanation ***\n" +
                "Kandane's Algorithm is a famous method to solve maximum subarray problem.\n" +
                "In computer science, the the maximum subarray problem is the task of finding the contiguous subarray \n" +
                "within a one-dimensional array of numbers which has the largest sum. \n" +
                "For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4;\n" +
                "the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6.\n" +
                "*** Pseudocode ***\n" +
                "Initialize maxSoFar= 0 and maxEndingHere = 0\n" +
                "Iterate over each element of the array\n" +
                "maxEndingHere = maxEndingHere + a[i]\n" +
                "if(maxEndingHere < 0)\n" +
                " maxEndingHere = 0\n" +
                "if(maxSoFar < maxEndingHere)\n" +
                " maxSoFar = maxEndingHere\n" +
                "return maxSoFar\n" +
                "*** Quick Sort Output ***");
        KandanesAlgo.main(args);//execute linear search
        System.out.println("*** Reference ***\n" +
                "https://java2blog.com/kadane-algorithm-in-java/");
    }
}
