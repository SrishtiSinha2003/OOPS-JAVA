import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit X: ");
        int X = sc.nextInt();
        
        System.out.println("Enter the upper limit Y: ");
        int Y = sc.nextInt();
        
        System.out.println("Enter how many prime numbers N : ");
        int N = sc.nextInt();
        
        if (X >= Y || X < 0 || Y < 0 || N < 0) {
            System.out.println("Invalid input. Please enter valid positive values.");
        } else {
            int count = 0;
            for (int i = X; i <= Y && count < N; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                    count++;  
                }
            }
        }
        sc.close();
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
}