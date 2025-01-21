
import java.util.*;

public class ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("ASCII value of '" + ch + "' is: " + (int) ch);

        System.out.println("ASCII values of digits 0-9:");
        scanner.close();
    }
}


