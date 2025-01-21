import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sumOdd = 0, sumEven = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            num /= 10;
        }

        System.out.println("Sum of odd digits: " + sumOdd);
        System.out.println("Sum of even digits: " + sumEven);

        sc.close();
    }
}
