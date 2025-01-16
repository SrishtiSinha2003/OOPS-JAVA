import java.util.Scanner;

public class FirstSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Name: " + name);

        System.out.print("Enter your registration number: ");
        int regNo = sc.nextInt();
        System.out.println("Registration Number: " + regNo);

        System.out.print("Enter your date of birth: ");
       sc.nextLine();
        String dob = sc.nextLine();
        System.out.println("Date of Birth: " + dob);
        
        sc.close(); 
    }
}

