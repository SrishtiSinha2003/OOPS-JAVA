public class ArrayFreq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 1, 4};
        int n = arr.length;
        boolean[] visited = new boolean[n];
    
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
    
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark the element as visited
                    count++;
                }
            }
            System.out.println("Element: " + arr[i] + ", Frequency: " + count);
        }
    }
}
