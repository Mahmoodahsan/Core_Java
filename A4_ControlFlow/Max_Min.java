public class Max_Min {
    static int Max(int arr[],int n){
        int max=0;
        for(int i=0;i<n;i++){
         if(max<arr[i]){
           max=arr[i];
         }
        }
        return max;
    }
    static int Min(int arr[],int n){
        int min=arr[1];
        for(int i=0;i<n;i++){
         if(arr[i]<min){
           min=arr[i];
         }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[]={4,5,7,9,23,3,2,1};
        int n=arr.length;
        System.out.println("max value is:"+Max(arr,n));
        System.out.println("min value is:"+Min(arr,n));
    }
}
