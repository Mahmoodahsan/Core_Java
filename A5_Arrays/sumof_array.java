package array;
public class sumof_array {
    public static void main(String args[]){
      //  int array[]=new int[10];
       int d[]={1,2,3,4,5,6,7,8,9,0};
       int arr[]=d;
       int sum=0;
       for(int i=0;i<d.length-1;i++){
          sum+=(arr[i]*d[i+1]+d[i]*arr[i+1]);
          System.out.println(sum);
       }
      System.out.println("/n**************************/n");
       System.out.println("sum of two arrays:"+sum);
    }
}
