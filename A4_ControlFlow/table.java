import java.util.Scanner;
public class table {
    public static void main(String args[]){
    System.out.println("which number of table you want to see");
    //System.out.println("untill where");
    Scanner obj=new Scanner(System.in);
    int m=obj.nextInt();
    System.out.println("untill where");
    int n=obj.nextInt();
    System.out.println("the value of m and  n is %d :"+m+ "  "+n);
    System.out.println("table of"+m+" is ");
    for(int i=1;i<=n;i++){
    System.out.println(m+"*"+i+"="+m*i);
    }
    obj.close();
    }
}
