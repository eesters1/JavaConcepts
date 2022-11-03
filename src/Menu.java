import java.util.Scanner;

public class Menu {
    public static void main() {
        //System.out.println("This is the menu page!"); //Test to ensure Menu.java is working

        int menuChoice;
        Scanner sc = new Scanner(System.in);

        //Menu Options
        System.out.println("What Java topic would you like to explore?");
        System.out.println("1. History of Java");
        System.out.println("2. Pros and Cons of Java");
        System.out.println("3. Java Fundamentals");
        System.out.println("4. Algorithms");

        menuChoice = sc.nextInt(); //Store selected menu choice

        switch(menuChoice){         //Direct user to proper page or submenu
            case 1: HistoryOfJava.main();
                break;
            case 2: ProsAndCons.main();
                break;
            case 3: Fundamentals.main(); //Action Item -- Not filled yet
                break;
            case 4: Algorithms.main(); //Action Item -- Not filled yet
                break;
            default: System.out.println("Please choose a valid option!");
                Menu.main();        //Reprints menu w/ invalid option
        }
    }
}
