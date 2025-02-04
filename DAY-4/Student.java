class Student{
    String name;
    int rollNumber;
    String[] subject;
    int[] totalMarks;

    public Student(String name, int rollNumber, String[] subject, int[] totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subject = subject;
        this.totalMarks = totalMarks;
    }
    public int CalculateMarks() {
        int sum = 0;
        for(int marks : totalMarks) {
            sum += marks;
        }
        return sum;
    }
    public String grade() {
        int total = CalculateMarks();
        if (total >= 270) return "O";
        else if (total >= 240) return "E"; 
        else if (total >= 210) return "A"; 
        else if (total >= 180) return "B";
        else if (total >= 150) return "C"; 
        else return "Fail";
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Total Marks: " + CalculateMarks() + ", Grade: " + grade());
    }
    
    public static void main(String[] args) {
        String[] subjects = {"Math", "Science", "English"};
        int[] marks1 = {85, 90, 80};
        int[] marks2 = {75, 60, 70};

        Student student1 = new Student("Alice", 1, subjects, marks1);
        Student student2 = new Student("Bob", 2, subjects, marks2);

        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}

