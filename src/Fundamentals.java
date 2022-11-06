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
        System.out.println("4. Methods/Functions");
        System.out.println("5. Packages");
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
            case 5: Fundamentals.packages();
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
        System.out.println("Primitive Data Types");
        System.out.println(" - byte: 1 byte, Stores whole numbers from -128 to 127");
        System.out.println(" - short: 2 bytes, Stores whole numbers from -32,768 to 32,767");
        System.out.println(" - int: 4 bytes, (ex: int myNum = 5;),Stores whole numbers from -2,147,483,648 to 2,147,483,647");
        System.out.println(" - long: 8 bytes, Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println(" - float: 4 bytes, (ex: float myFloatNum = 5.99f;), Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits");
        System.out.println(" - double: 8 bytes, Stores fractional numbers. Sufficient for storing 15 decimal digits");
        System.out.println(" - boolean: 1 bit, (ex: boolean myBool = true;), Stores true or false values");
        System.out.println(" - char: 2 bytes, (ex: myLetter = 'D'), Stores a single character/letter or ASCII values");
        System.out.println("Non-Primitive Data Types");
        System.out.println(" - String: A variable that contains a collection of characters surrounded by double quote");
        System.out.println("     Some String methods include: length(), toUpperCase(), toLowerCase(), indexOf()");
        System.out.println("     The format to use a string method is variable.method(). For example, String num = ''Hello''; txt.length(); Would output 5.");
        System.out.println(" - Array: Used to store multiple values in a single variable instead of declaring separate variable for each value.");
        System.out.println("     Example array declaration: Int[] num = {1, 2, 3, 4};");
        System.out.println("     Example array element access: System.out.println(num[0]); (Note: indexes start w/ 0)");

        Fundamentals.repeat();
    }
    public static void operators() {
        System.out.println("\n***** Operators *****\n");
        System.out.println("Java divides the operators into the following groups:");
        System.out.println(" - Arithmetic");
        System.out.println(" - Assignment");
        System.out.println(" - Comparison");
        System.out.println(" - Logical\n");
        System.out.println("Arithmetic Operators");
        System.out.println(" - Addition: +");
        System.out.println(" - Subtraction: -");
        System.out.println(" - Multiplication: *");
        System.out.println(" - Division: /");
        System.out.println(" - Modulus: %");
        System.out.println(" - Increment: ++");
        System.out.println(" - Decrement: --");
        System.out.println("Assignment Operators");
        System.out.println(" - Equals: =");
        System.out.println(" - Add to variable: +=");
        System.out.println(" - Subtract from variable: -=");
        System.out.println(" - Multiply by variable: *=");
        System.out.println(" - Divide by variable: /=");
        System.out.println(" - Modulo by variable: %=");
        System.out.println("Comparison Operators");
        System.out.println(" - Equal to: ==");
        System.out.println(" - Not equal: !=");
        System.out.println(" - Greater than: >");
        System.out.println(" - Less than: <");
        System.out.println(" - Greater than or equal to: >=");
        System.out.println(" - Less than or equal to: <=");
        System.out.println("Logical Operators");
        System.out.println(" - Logical And: &&");
        System.out.println(" - Logical Or: ||");
        System.out.println(" - Logical Not: !");

        Fundamentals.repeat();
    }
    public static void loops() {
        System.out.println("\n***** Loops *****\n");
        System.out.println("Java provides the following loops:");
        System.out.println(" - if/else");
        System.out.println(" - switch");
        System.out.println(" - while");
        System.out.println(" - for");
        System.out.println("If/Else");
        System.out.println("     if(condition) {\n" +
                "       //block of code to be executed if condition is true\n" +
                "     } else {\n" +
                "       //block of code to be executed if condition is false\n" +
                "     }");
        System.out.println("Switch");
        System.out.println("     switch(expression) {\n" +
                "     case x:\n" +
                "       //block of code\n" +
                "       break;\n" +
                "     case y:\n" +
                "       //block of code\n" +
                "       break;" +
                "     default:\n" +
                "       //block of code\n" +
                "     }");
        System.out.println("While");
        System.out.println("     while(condition) {\n" +
                        "       //block of code\n" +
                        "     }");
        System.out.println("   OR\n");
        System.out.println("     do{\n" +
                "       //block of code\n" +
                "     }while (condition);");
        System.out.println("For");
        System.out.println("     for(statement 1; statement 2; statement 3) {\n" +
                "       //block of code\n" +
                "     }");
        System.out.println("statement 1 is executed (one time) before the execution of the code block.\n" +
                "statement 2 defines the condition for executing the code block.\n" +
                "statement 3 is executed (every time after the code block has been executed.");

        Fundamentals.repeat();
    }
    public static void methods() {
        System.out.println("\n***** Methods/Functions *****\n");
        System.out.println(" - A method/function is a block of code which only runs when it is called.\n" +
                " - A method must be declared within a class. (ex. public class Main { static void myMethod() {} })\n" +
                " - A method can be called using the method's name followed by two parentheses (ex. myMethod();)\n" +
                " - Information can be passed to methods as parameters. (ex. static void myMethod(String fname) {})\n" +
                " - If you want the method to return a value, you can use a primitive data type instead of void and \n" +
                "   use the return keyword inside the method. (ex. static int myMethod(int x) {return 5 + x;})\n" +
                " - The result of a method can also be stored in a variable. (ex. int z = myMethod(5, 3));\n" +
                "   \n*** Important Terms ***\n" +
                " - Static - the method belongs to the Main class and is not an object of the main class\n" +
                " - Void - this method does not have a return value.\n" +
                " - Return - keyword to determine what value will be returned from the method");

        Fundamentals.repeat();
    }
    public static void packages() {
        System.out.println("\n***** Packages *****\n");
        System.out.println(" - The full list of built-in Java packages can be found at: https://docs.oracle.com/javase/8/docs/api/\n");
        System.out.println(" - You can also declare your own packages.\n" +
                "      - Create a package: package mypack;\n" +
                "      - Import a single class: import package.name.Class;\n" +
                "      - Import the whole package: import package.name.*;\n" +
                " \n*** Common Java Packages ***\n" +
                " - java.util.Scanner - used to get user input\n" +
                " - java.io - contains classed for supporting file input/output operations\n" +
                " - java.util - contains utility classes which implement data structures linke linked list, dictionary, data/time operations, etc.\n" +
                " - java.applet - contains classes for creating applets\n" +
                " - java.awt - contains classes for implementing the components for graphical user interfaces (buttons, menus, etc.)\n" +
                " - java.net - contains classes for supporting networking operations");

        Fundamentals.repeat();
    }
    public static void files() {
        System.out.println("\n***** Files *****\n");
        System.out.println(" - To handle files you must use import java.io.File;\n" +
                " - To use the file class, create an object of the class and specify \n" +
                "   the filename or directory name (ex. File myObj = new File('filename.txt');\n" +
                "\n*** Common Methods ***\n" +
                " - canRead() - boolean, Tests whether the file is readable or not\n" +
                " - canWrite() - boolean, Tests whether the file is writable or not\n" +
                " - createNewFile() - boolean, Creates an empty file\n" +
                " - delete() - boolean, Deletes a file\n" +
                " - exists() - boolean, Tests whether the file exists\n" +
                " - getName() - string, Returns the name of the file\n" +
                " - getAbsolutePath() - string, Returns the absolute pathname of the file\n" +
                " - length() - long, Returns the size of the file in bytes\n" +
                " - list() - String[], Returns an array of the files in the directory\n" +
                " - mkdir() - boolean, Creates a directory\n");

        Fundamentals.repeat();
    }
}
