import java.util.Scanner;

class aarray{
    static void INTarr(){
        int n=4;
        int[]arr=new int[n];
        System.out.println("int array declaration is as folows: int[]arr=new int[n];");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        System.out.print("int type aray element is:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void CHARarr(){
        int n=0;
        char[]arr=new char[n];
        System.out.println("char array decl.....:char[]arr=new char[n];");
    }
    static void STRarr(){
        int n=0;
        String[]arr=new String[n];
        System.out.println("staring array declarrati..: String[]arr=new String[n];");
    }
}
public class Main {
    public static void main(String[] args) {
        aarray.INTarr();
        aarray.CHARarr();
        aarray.STRarr();
    }
}