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

public class Details {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in); 

        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee();
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i].getDetails(scanner);
        }

        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        scanner.close(); 
    }
}
