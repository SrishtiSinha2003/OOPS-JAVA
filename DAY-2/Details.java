
import java.util.Scanner;

class Employee {
    String name;
    int age;
    String department;
    double salary;

    public void getDetails(Scanner scanner) { 
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter department: ");
        department = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine(); 
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------------");
    }
}
   
