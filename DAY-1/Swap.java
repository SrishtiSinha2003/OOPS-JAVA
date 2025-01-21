<<<<<<< HEAD
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping using third variable: a = " + a + ", b = " + b);

        System.out.print("Enter the first number again: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number again: ");
        b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping without using third variable: a = " + a + ", b = " + b);

        scanner.close();
    }
}

=======
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping using third variable: a = " + a + ", b = " + b);

        System.out.print("Enter the first number again: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number again: ");
        b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping without using third variable: a = " + a + ", b = " + b);

        scanner.close();
    }
}

>>>>>>> 0dd39b60492e674de56f8ffb1fd2f7473779b7ff
