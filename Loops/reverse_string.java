package all_for_loop;
//import java.util.Scanner;
public class reverse_string {
    public static void main(String args[]){
    String k="mahmood mksd",l="";
    System.out.println(k.length());
    for(int i=k.length()-1;i>=0;i--){
        l=l+k.charAt(i);
        System.out.print(k.charAt(i));
    }
    System.out.println();
    System.out.println(l);
}
}
