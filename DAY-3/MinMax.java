public class MinMax{
    public static void main(String[]args){
        int arr[]={2,8,3,1,6};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
              min=arr[i];}
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min value:" + min);
        System.out.println("max value:" +max);
    }
}