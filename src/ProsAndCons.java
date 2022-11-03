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
        System.out.println("1. Simple" +
                "\nJava is easy to learn and understand. It removes all complex features  of C and C++ like pointers, structures, unions, and " +
                "\nmakes the implementation of codes easier.");
        System.out.println("\n2. Object-Oriented Programming" +
                "\nOOP helps maintain large code by breaking it into smaller fragments.");
        System.out.println("\n3. Secure Language" +
                "\nJava uses OOP concepts like encapsulation, abstraction, and inheritance which increases security and prevents" +
                "\nunauthorized access to users. Unlike C and C++ which use pointers that allow access to memory location. ");
        System.out.println("\n4. Cheap and Economical to Maintain" +
                "\nDue to its simple build, java is cheap and easy to develop and maintain. The fact that it is platform-independent reduces cost greatly.");
        System.out.println("\n5. Platform-Independent" +
                "\nJava can be run on any systems that has Java in it. It does not depend on OS or hardware.");
        System.out.println("\n6. High-Level Programming Language" +
                "\nJava is written in high-level (or human) language. It has an interpreter which interprets the code to machine level.");
        System.out.println("\n7. Supports Portability Feature" +
                "\nJava is highly portable because it is platform independent as it does not require special hardware to run.");
        System.out.println("\n8. Provides Automatic Garbage Collection" +
                "\nIn Java, the JVM automatically manages the memory. So, whenever there is an object that doesn't refer to any class and needs" +
                "\nto be de-referenced, the JVM automatically removes them from the program.");
        System.out.println("\n9. Supports Multithreading" +
                "\nA thread is the smallest possible unit of a process. To gain max CPU utilization, multithreading is a key component." +
                "\nOn Java, we can run more that one thread at a time. They share a common memory to increase the efficiency and performance" +
                "\nof the application. Threads run independently of one another.");
        System.out.println("\n10. Stable" +
                "\nJava receives regular updates to remove bugs.");
        System.out.println("\n11. Distributed Language" +
                "\nJava has the mechanism for sharing data and programs among multiple computers. " +
                "\nIt also supports RMI (Remote Method Invocation) and socket programming.");
        System.out.println("\n12. Efficient Memory Allocation System" +
                "\nJava divides memory into 2 parts: heap and stack. The JVM allocates memory from either of the two parts depending on the requirement.");
        System.out.println("\n13. Massive Community Support" +
                "\nJava has been able to build a community of developers larger than any other programming language in the world." +
                "\nBecause of this, almost all Java queries have been resolved in StackOverflow.");

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
