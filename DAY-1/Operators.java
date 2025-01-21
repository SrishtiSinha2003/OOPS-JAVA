

import java.util.*;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

      
        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
        System.out.println("Division: " + a + " / " + b + " = " + (b != 0 ? (a / b) : "Undefined (Division by zero)"));
        System.out.println("Modulus: " + a + " % " + b + " = " + (b != 0 ? (a % b) : "Undefined (Division by zero)"));

  
        System.out.println("\nRelational Operators:");
        System.out.println(a + " > " + b + ": " + (a > b));
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " == " + b + ": " + (a == b));
        System.out.println(a + " != " + b + ": " + (a != b));
        System.out.println(a + " >= " + b + ": " + (a >= b));
        System.out.println(a + " <= " + b + ": " + (a <= b));


        System.out.println("\nLogical Operators:");
        System.out.println("(" + a + " > 0) && (" + b + " > 0): " + ((a > 0) && (b > 0)));
        System.out.println("(" + a + " > 0) || (" + b + " > 0): " + ((a > 0) || (b > 0)));
        System.out.println("!(" + a + " > 0): " + (!(a > 0)));

        scanner.close();
    }
}
