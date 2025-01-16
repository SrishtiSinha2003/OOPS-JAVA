import java.util.*;

class Number {
    double num1, num2;

    Number(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {
        return num1 + num2;
    }

    double subtract() {
        return num1 - num2;
    }

    double multiply() {
        return num1 * num2;
    }

    double divide() {
        return num2 != 0 ? num1 / num2 : Double.NaN;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        Number numbers = new Number(num1, num2);

        System.out.println("Select Operation: 1. Add 2. Subtract 3. Multiply 4. Divide");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + numbers.add());
                break;
            case 2:
                System.out.println("Result: " + numbers.subtract());
                break;
            case 3:
                System.out.println("Result: " + numbers.multiply());
                break;
            case 4:
                double result = numbers.divide();
                if (Double.isNaN(result)) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
