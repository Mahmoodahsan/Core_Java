import java.util.Scanner;

public class RemoveSpace {
    static void remove(String str){
        int length=str.length();
        int i=0;
        String k="";
        char s=' ';
        while(i<length){
            if(str.charAt(i)!=' '){
                //1st method
                s=str.charAt(i);
                System.out.print(s);
                //2nd method
                k+=str.substring(i,i+1);
            }
            i++;
        }
        System.out.println();
        System.out.println("remove space using substring method"+k);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sentence");
        String str=sc.nextLine();
        System.out.println(str);
        RemoveSpace.remove(str);
    }
}