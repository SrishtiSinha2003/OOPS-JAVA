import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int sumOfDigits = 0, temp = number;

        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (number % sumOfDigits == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}