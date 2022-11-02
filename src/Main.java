import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int menuChoice;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nHello! Welcome to The Java Dictionary!\n"); //Test to ensure Main.java is working

        Menu.main(); //Display menu choices

        menuChoice = sc.nextInt(); //Store selected menu choice

        switch(menuChoice){         //Direct user to proper page or submenu
            case 1: HistoryOfJava.main();
                    break;
            case 2: Fundamentals.main();
                    break;
            case 3: Algorithms.main();
                    break;
            default: System.out.println("Please choose a valid option!");
        }

        //System.out.println("\nThank you for visiting The Java Dictionary!\n"); //Test to ensure Main.java is working
    }
}