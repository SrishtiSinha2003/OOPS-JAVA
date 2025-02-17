// Base class: Person
class Person {
    protected String name; // Protected attribute

    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
    }

    // Default constructor
    public Person() {
        this.name = "Unknown";
    }

    // Protected method
    protected void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

// Subclass: Student that inherits from Person
class Student extends Person {
    protected int studentID;

    // Constructor with two parameters
    public Student(String name, int studentID) {
        super(name); // Calling Person constructor
        this.studentID = studentID;
    }

    // Default constructor for Student
    public Student() {
        super();
        this.studentID = 0;
    }

    // Overriding the greet method
    @Override
    protected void greet() {
        super.greet();
        System.out.println("I am a student with ID: " + studentID);
    }
}

// Subclass: GraduateStudent that inherits from Student
class GraduateStudent extends Student {
    String researchTopic;

    // Constructor with three parameters
    public GraduateStudent(String name, int studentID, String researchTopic) {
        super(name, studentID); // Calling Student constructor
        this.researchTopic = researchTopic;
    }

    // Default constructor for GraduateStudent
    public GraduateStudent() {
        super();
        this.researchTopic = "Unknown";
    }

    @Override
    protected void greet() {
        super.greet();
        System.out.println("My research topic is: " + researchTopic);
    }
}

// Example usage:
public class Main {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("Alice", 101, "Machine Learning");
        gradStudent.greet();  // Accessing protected method in subclass
    }
}

