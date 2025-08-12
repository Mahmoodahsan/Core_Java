import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n=1;
        for(int i=1;i<10;i++){
            //space
            for(int j=0;j<10-i;j++){
                System.out.print(" ");
            }
            //value print
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
            }
            System.out.println();
            n++;
        }
    }
}