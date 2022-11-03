import java.util.Scanner;
public class ProsAndCons {
    public static void main() {

        System.out.println("\nThis is the Pros and Cons of Java page!"); //Test to ensure .java file is working

        ProsAndCons.submenu();
        ProsAndCons.elaborate();

    }
    public static void submenu() {
        //Pros
        System.out.println("\n***** Pros *****\n");
        System.out.println("1. Simple");
        System.out.println("2. Object-Oriented Programming");
        System.out.println("3. Secure Language");
        System.out.println("4. Cheap and Economical to Maintain");
        System.out.println("5. Platform-Independent");
        System.out.println("6. High-Level Programming Language");
        System.out.println("7. Supports Portability Feature");
        System.out.println("8. Provides Automatic Garbage Collection");
        System.out.println("9. Supports Multithreading");
        System.out.println("10. Stable");
        System.out.println("11. Distributed Language");
        System.out.println("12. Efficient Memory Allocation System");
        System.out.println("13. Massive Community Support");

        //Cons
        System.out.println("\n***** Cons *****\n");
        System.out.println("1. Slow and Poor Performance");
        System.out.println("2. Poor GUI");
        System.out.println("3. No backup facility");
        System.out.println("4. Significant Memory Space Required");
        System.out.println("5. Verbose and Complex Code");
        System.out.println("6. Paid Commercial License");
    }
    public static void elaborate(){
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWould you like to elaborate on 1. Pros, 2. Cons, or 3. Neither?");
        choice = sc.nextInt(); //Store selected menu choice

        switch(choice) {         //Direct user to proper page or submenu
            case 1:
                    ProsAndCons.pros();
                    break;
            case 2:
                    ProsAndCons.cons();
                    break;
            case 3:
                    System.out.println("\nThank you for visiting the Pros and Cons of Java page!"); //Test to ensure .java file is working
                    break;
            default: System.out.println("Please choose a valid option!");
                    ProsAndCons.elaborate();
        }
    }

    public static void pros() {
        //System.out.println("This section is for pros");
        System.out.println("\n***** Pros Elaborated *****\n");
        System.out.println("1. Simple - ");
        System.out.println("2. Object-Oriented Programming");
        System.out.println("3. Secure Language");
        System.out.println("4. Cheap and Economical to Maintain");
        System.out.println("5. Platform-Independent");
        System.out.println("6. High-Level Programming Language");
        System.out.println("7. Supports Portability Feature");
        System.out.println("8. Provides Automatic Garbage Collection");
        System.out.println("9. Supports Multithreading");
        System.out.println("10. Stable");
        System.out.println("11. Distributed Language");
        System.out.println("12. Efficient Memory Allocation System");
        System.out.println("13. Massive Community Support");

        ProsAndCons.elaborate();
    }
    public static void cons() {
        //System.out.println("This section is for cons");
        System.out.println("\n***** Cons Elaborated *****\n");
        System.out.println("1. Slow and Poor Performance" +
                "\nJava is slower and consumes more memory compared to native languages like C and C++. " +
                "\nThis is due to the additional work of the interpreter to convert the code into machine language." +
                "\nThe automatic garbage collection also runs continuously in the background, hampering the performance.");
        System.out.println("\n2. Poor GUI" +
                "\nThe GUI builder is poor and is unable to build complex UI even when frameworks such as Swing, SWT, JavaFX, and JSF are used.");
        System.out.println("\n3. No backup facility" +
                "\nJava has 0 features to backup the data of users.");
        System.out.println("\n4. Significant Memory Space Required" +
                "\nRequires more memory compared to C and C++. The memory management is poor as Java uses a garbage collector at the price of performance.");
        System.out.println("\n5. Verbose and Complex Code" +
                "\nFor example: A simple input requires two lines of code in Java" +
                "\nBuffedReader br = new BufferedReader(new InputStreamReader(System.in));" +
                "\nint num = Integer.parseInt(br.readLine());" +
                "\nWhile the same thing can be written in C using 1 line" +
                "\nscanf(%d, &num)");
        System.out.println("\n6. Paid Commercial License" +
                "\nAlthough general purpose is still free, " +
                "you must pay a fee based on the number of systems for comercial licenses.");

        ProsAndCons.elaborate();
    }
}
