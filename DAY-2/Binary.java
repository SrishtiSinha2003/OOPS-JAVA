<<<<<<< HEAD
import java.util.Scanner;

public class Binary {
    
    public static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.append(num % 2);
            num /= 2;
        }
        return binary.reverse().toString();
    }

    public static String toHexadecimal(int num) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            hex.append(hexChars[num % 16]);
            num /= 16;
        }
        return hex.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Binary: " + toBinary(num));
        System.out.println("Hexadecimal: " + toHexadecimal(num));

        scanner.close();
    }
}

=======
import java.util.Scanner;

public class Binary {
    
    public static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.append(num % 2);
            num /= 2;
        }
        return binary.reverse().toString();
    }

    public static String toHexadecimal(int num) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            hex.append(hexChars[num % 16]);
            num /= 16;
        }
        return hex.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Binary: " + toBinary(num));
        System.out.println("Hexadecimal: " + toHexadecimal(num));

        scanner.close();
    }
}

>>>>>>> 6f1627970ad1d9fbae61cebba598c0922352eee7
