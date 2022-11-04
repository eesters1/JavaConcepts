import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String repeat = "Y";
        Scanner sc = new Scanner(System.in);

        System.out.println("\nHello! Welcome to The Java Dictionary!\n"); //Test to ensure Main.java is working

        while(repeat.equals("Y")){
            Menu.main(); //Display menu choices

            System.out.println("\nWould you like to view another Java topic? (Y/N)\n");
            repeat = sc.nextLine(); //Store selected menu choice

            switch(repeat){
                case "N":
                        break;
                default: System.out.println("Please choose a valid option!");
                    repeat = sc.nextLine(); //Store selected menu choice
            }
        }

        System.out.println("\nThank you for visiting The Java Dictionary!\n"); //Test to ensure end is reached
    }
}