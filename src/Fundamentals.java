import java.util.Scanner;
public class Fundamentals {
    public static void main() {
        System.out.println("\nThis is the Java Fundamentals page!"); //Test to ensure .java file is working

        Fundamentals.choose();
    }

    public static void choose(){
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWhat topic would you like to see?");
        System.out.println("1. Data Types");
        System.out.println("2. Operators");
        System.out.println("3. Loops");
        System.out.println("4. Methods");
        System.out.println("5. Input");
        System.out.println("6. Files");

        choice = sc.nextInt(); //Store selected menu choice

        switch(choice) {         //Direct user to proper page or submenu
            case 1: Fundamentals.dataTypes();
                break;
            case 2: Fundamentals.operators();
                break;
            case 3: Fundamentals.loops();
                break;
            case 4: Fundamentals.methods();
                break;
            case 5: Fundamentals.input();
                break;
            case 6: Fundamentals.files();
                break;
            default: System.out.println("Please choose a valid option!");
                Fundamentals.choose();
        }
    }
    public static void repeat() {
        String repeat = "Y";
        Scanner sc = new Scanner(System.in);

        while(repeat.equals("Y")){

            System.out.println("\nWould you like to view another Fundamental topic? (Y/N)\n");
            repeat = sc.nextLine(); //Store selected menu choice

            switch(repeat){
                case "Y": Fundamentals.choose();
                    break;
                case "N": System.out.println("\nThank you for visiting The Fundamentals Section!\n"); //Test to ensure end is reached
                    break;
                default: System.out.println("Please choose a valid option!");
                        Fundamentals.repeat(); //Store selected menu choice
            }
        }
    }
    public static void dataTypes() {
        System.out.println("\n***** Data Types *****\n");

        Fundamentals.repeat();
    }
    public static void operators() {
        System.out.println("\n***** Operators *****\n");

        Fundamentals.repeat();
    }
    public static void loops() {
        System.out.println("\n***** Loops *****\n");

        Fundamentals.repeat();
    }
    public static void methods() {
        System.out.println("\n***** Methods *****\n");

        Fundamentals.repeat();
    }
    public static void input() {
        System.out.println("\n***** Input *****\n");

        Fundamentals.repeat();
    }
    public static void files() {
        System.out.println("\n***** Files *****\n");

        Fundamentals.repeat();
    }
}
