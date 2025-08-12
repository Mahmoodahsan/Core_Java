package ROUGH;
import java.util.Scanner;;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         sc.close();
         for (int i=0;i<t ;i++ ){
             int A=sc.nextInt();
             int B=sc.nextInt();
             int C=sc.nextInt();
             float k=(A+B)/2;
             System.out.println(k);
             float Average=((A+B)/2);
             if(Average>C){
                 System.out.println("YES");
             }
             else {
                 System.out.println("NO");
             }
         } 
	}
}