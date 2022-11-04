import java.util.Scanner;

public class Algorithms {
    public static void main() {
        System.out.println("\nThis is the Algorithms page!"); //Test to ensure .java file is working

        Algorithms.choose();
    }
    public static void choose(){
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWhat type of algorithm would you like to see?");
        System.out.println("1. Sort");
        System.out.println("2. Search");
        System.out.println("3. Array");
        System.out.println("4. Basic");
        System.out.println("5. Graph\n");

        choice = sc.nextInt(); //Store selected menu choice

        switch(choice) {         //Direct user to proper page or submenu
            case 1: SortAlgo.sortMenu();
                break;
            case 2: SearchAlgo.searchMenu();
                break;
            case 3: ArrayAlgo.arrayMenu();
                break;
            case 4: BasicAlgo.basicMenu();
                break;
            case 5: GraphAlgo.graphMenu();
                break;
            default: System.out.println("Please choose a valid option!");
                Algorithms.choose();
        }
    }
    public static void repeat() {
        String repeat = "Y";
        Scanner sc = new Scanner(System.in);

        while(repeat.equals("Y")){

            System.out.println("\nWould you like to view another Algorithm? (Y/N)\n");
            repeat = sc.nextLine(); //Store selected menu choice

            switch(repeat){
                case "Y": Algorithms.choose();
                    break;
                case "N": System.out.println("\nThank you for visiting The Algorithms Section!\n"); //Test to ensure end is reached
                    break;
                default: System.out.println("Please choose a valid option!");
                    Algorithms.repeat(); //Store selected menu choice
            }
        }
    }
}
