package all_for_loop;

public class sixth {
    public static void main(String args[]){
      // int []k=new int[20];
      // System.out.println(k);
       int d[]={1,2,3,4,5,6,7,8,9,10};
       int arr[]=d;
       int sum=0;
       for(int i=0;i<d.length-1;i++){
         // System.out.println(arr[i]+" "+d[i+1]+" "+arr[i+1]);
          sum+=(arr[i]*d[i+1]+d[i]*arr[i+1]);
          System.out.println(sum);
       }
       System.out.println("sum of two arrays:"+sum);
    }
}
