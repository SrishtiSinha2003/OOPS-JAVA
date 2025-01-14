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

        sc.nextLine();  // Consume the newline character left after nextInt()
        System.out.print("Enter your date of birth: ");
        String dob = sc.nextLine();
        System.out.println("Date of Birth: " + dob);
        
        sc.close(); 
    }
}

