public class ArrayEqual {
    public static void main(String[] args) {
        int[] arr1 = {10, 30, 40};
        int[] arr2 = {10, 20, 30, 40};
        if(arr1.length == arr2.length) {
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] == arr2[i]){
                    System.out.println("Equal");
                }
            }
        } else {
            System.out.println("Not equal");
        }
    }
}
