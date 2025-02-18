import java.util.Scanner;

public class MultiplyOverload {
    public static int multiply(int a, int b) {
        System.out.println("Method for 3 numbers called");
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        System.out.println("Method for 3 numbers called");
        return a * b * c;
    }
    public static int multiply(int[] numbers) {
        System.out.println("Method for multiple numbers called");
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        int count = 0;

        while(true) {
            System.out.print("Enter a number (00 to stop): ");
            int number = sc.nextInt();
            if (number == 00) {
                break;
            }
            numbers[count] = number;
            count++;
        }
        if (count == 2){
            int result = multiply(numbers[0], numbers[1]);
            System.out.println("Result: " + result);
        }
        else if (count == 3){
            int result = multiply(numbers[0], numbers[1], numbers[2]);
            System.out.println("Result: " + result);
        }
        else {
            int result = multiply(numbers);
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}
