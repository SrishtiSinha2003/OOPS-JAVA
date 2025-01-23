import java.util.Scanner;

public class Armstrong {
    
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;  
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digit;
        int n = String.valueOf(num).length();
        while (temp > 0) {
            digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }
        return sum == num;
    }

    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num && num != 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        int sum = sumOfDigits(num);
        System.out.println("Sum is: " + sum);

        System.out.println("Prime: " + (isPrime(sum) ? "Y" : "N"));
        System.out.println("Armstrong: " + (isArmstrong(sum) ? "Y" : "N"));
        System.out.println("Perfect: " + (isPerfect(sum) ? "Y" : "N"));

        scanner.close();
    }
}

