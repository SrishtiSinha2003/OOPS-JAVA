import java.util.Arrays;

public class ArrayCopy {
    public static int[] copy(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return new int[0];
        }
        return Arrays.copyOfRange(arr, index + 1, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int number = 30;

        int[] result = copy(arr, number);
        System.out.println("Elements after the specified number: " + Arrays.toString(result));
    }
}