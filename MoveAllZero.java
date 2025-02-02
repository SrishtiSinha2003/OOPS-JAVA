public class MoveAllZero {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 2, 4, 7, 7, 4, 5, 0, 8, 0};
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }
        while (index < n) {
            result[index++] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
