  class  Key{
     static int findIndex(int []arr,int key){
         int k=-1;
         for(int i=0;i<arr.length;i++){
             if(arr[i]==key){
                 return i+1;
             }
         }
         return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr={2,43,542,3,67,86};
        int key=43;
        System.out.println("43 is present At Index:"+Key.findIndex(arr,key));

    }
}