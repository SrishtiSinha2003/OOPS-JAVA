import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter time (in years): ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;
        double finalAmount = principal + interest;

        System.out.println("Accrued Interest: " + interest);
        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}