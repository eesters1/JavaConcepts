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
