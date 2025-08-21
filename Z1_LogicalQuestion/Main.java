import java.util.Scanner;

class SumOfRange{
    static int Range(int n,int[]arr,int l,int r){
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 6, 5};
        int n = arr.length;
        System.out.println("given array is:");
        for (int k=0;k<n;k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("number of queries");
            int query = sc.nextInt();
            for (int i = 0; i < query; i++) {
                System.out.println("between where to where you want sum plz enter");
                int l=sc.nextInt();
                int r=sc.nextInt();
                System.out.print("sum between"+l+" and"+r+"is:");
                System.out.println(SumOfRange.Range(n, arr,l,r));
            }
   sc.close();
    }
}