public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Change this value to your desired input
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

