import java.util.Scanner;
public class Fundamentals {
    public static void main() {
        System.out.println("\nThis is the Java Fundamentals page!"); //Test to ensure .java file is working

        Fundamentals.fundamentalMenu();
        Fundamentals.choose();
    }
    public static void fundamentalMenu() {
        System.out.println("");
    }
    public static void choose(){
        int choice;
        Scanner sc = new Scanner(System.in);

        choice = sc.nextInt(); //Store selected menu choice

        switch(choice) {         //Direct user to proper page or submenu
            case 1:
                break;
            default:
        }
    }
}
