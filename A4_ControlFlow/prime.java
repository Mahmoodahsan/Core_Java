import java.util.Scanner;
public class prime {
    static boolean prmnumb(int n){
        for(int x=2;x<n;x++){
            if(n%x==0) return false;
        }
      return true;
    } 
    public static void main(String args[]){
        System.out.println("enter the any value and check it is prime or not");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean A=prmnumb(x);
       System.out.println(A);
       sc.close();
    }
}