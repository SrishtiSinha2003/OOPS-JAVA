import java.util.Scanner;

public class ArrayMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        System.out.println("Total marks secured: " + totalMarks);

        if (totalMarks >= 400 && totalMarks <= 500) {
            System.out.println("Grade: O");
        } else if (totalMarks >= 300 && totalMarks < 400) {
            System.out.println("Grade: E");
        } else if (totalMarks >= 250 && totalMarks < 300) {
            System.out.println("Grade: A");
        } else if (totalMarks >= 200 && totalMarks < 250) {
            System.out.println("Grade: B");
        } else if (totalMarks >= 100 && totalMarks < 200) {
            System.out.println("Grade: I");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}