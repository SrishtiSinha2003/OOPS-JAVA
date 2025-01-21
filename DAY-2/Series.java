public class Series {
    public static void main(String[] args) {
        double sum = 0.0;
        
        for (int i = 0; i < 4; i++) { 
            sum += 1 / Math.pow(2, i);
        }
        System.out.printf("The sum of the series is : %.6f%n", sum);
    }
}