import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (num % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}