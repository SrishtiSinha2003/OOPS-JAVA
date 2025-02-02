public class ArrayProduct{
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1};
    
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin; 
                firstMin = num;       
            } else if (num < secondMin) {
                secondMin = num;     
            }
        }
        int minProduct = firstMin * secondMin;
        
        System.out.println("Minimum product: " + minProduct);
    }
}


