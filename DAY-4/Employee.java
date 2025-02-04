class Employee {
    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    void display() {
        System.out.println(name + "   " + yearOfJoining + "   " + address);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Name   Year of Joining   Address");

        Employee emp1 = new Employee("Ujwal", 2024, "BBS");
        Employee emp2 = new Employee("Ravi", 2023, "KUR");
        emp1.display();
        emp2.display();
    }
}
