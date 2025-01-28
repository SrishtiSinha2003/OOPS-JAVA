import java.util.Scanner;
public class KthNum {
    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 3, 10, 5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int K = sc.nextInt();
        boolean found=false;
        for (int num : arr) {
        if (num == K) {
            found=true;
            System.out.println("Number " + K + " is in the array.");}
        }
        if (!found) {
            System.out.println("Number " + K + " is not in the array.");
        }
        sc.close();
    }
}
