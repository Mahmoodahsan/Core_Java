import java.util.Scanner;
public class prime2 {
    public static void main(String [] args){
        System.out.println("enter value of a:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
               count++;
            }
        }
        if(count==0){
            System.out.println("prime number");
        }
        else System.out.println("not a prime number");
    }
    
}
