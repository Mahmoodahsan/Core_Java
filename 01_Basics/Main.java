package basic;
import java.util.Scanner;
//import java.util.*;

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner K = new Scanner(System.in);
        int n = K.nextInt();
        K.close();
       // Write your code here
       char a='A';
       for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                 System.out.print(a);
            }
            for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
            }
            a++;
             System.out.println();
        }
    }
}