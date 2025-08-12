package AptitudeQuestion;
import java.util.Scanner;
public class Cont_SumDigit {
    static public void main(String [] args){
       Scanner t=new Scanner(System.in);
       System.out.println("enter the any number you want:");
       int n=t.nextInt();
       t.close();
       int sum=0,rem,count=0,rev=0;
       while(n>0){
         rem=n%10;
         //count number of digits
         count++;
         //sum of digits
         sum+=rem;//sum=sum+rem;
         //reverse number 
         rev=rev*10+rem;
         n=n/10;
       }
       System.out.println(sum+" "+count+" "+rev);
       System.out.println(sum);
    }
}

