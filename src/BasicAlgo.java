import java.util.Scanner;
public class BasicAlgo {
    public static void basicMenu() {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("What basic algorithm would you like to see?");
        System.out.println("1. Euclid's");
        //System.out.println("2. Union Find");
        //System.out.println("3. Huffman Coding Compression\n");

        choice = sc.nextInt(); //Store selected menu choice

        //Direct user to proper page or submenu
        if (choice == 1) {
            BasicAlgo.euclidsText();
        } else {
            System.out.println("Please choose a valid option!");
            BasicAlgo.basicMenu();
        }

        Algorithms.repeat();
    }
    public static void euclidsText() {
        String[] args={};
        System.out.println("*** Brief Explanation ***\n" +
                "The Euclidean algorithm is a way to find the greatest common divisor \n" +
                "of two positive integers. GCD of two numbers is the largest number that \n" +
                "divides both of them. A simple way to find GCD is to factorize both numbers\n " +
                "and multiply common prime factors.\n" +
                "*** Quick Sort Output ***\n");
        EuclidsAlgo.main(args);//execute linear search
        System.out.println("*** Reference ***\n" +
                "https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/");
    }
}
