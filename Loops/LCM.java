import java.util.Scanner;
public class LCM {
    //LCM method is written below
    static int Lwstcmnfctr(int x,int y){
        int lowest=0;
        for(int i=x*y;i>=(x>y?x:y);i--){
            if(i%x==0 && i%y==0){
                lowest=i;
            }
        }
        return lowest;
    }
    public static void main(String args[]){
      System.out.println("enter the value of x and y:");
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
    //    int x=45,y=46;
       int L=Lwstcmnfctr(x,y);
       System.out.println("***********LCM OF " +x+" and "+y+ " IS:***************");
       System.out.print(L);
       sc.close();
    }
}
