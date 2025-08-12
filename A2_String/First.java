package STRING;
import java.util.Scanner;
public class First {
    public static void mai(String args[]){
        String s="abrakadabra";
        //1Q: The length of s
        System.out.println(s.length());

        //2Q: The third character in s (as in, the third character of “abcd” is “c”)
        System.out.println("what index charecter you want");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        if(c>s.length() ||c<0){
            System.out.println("index out of bound exception");
            System.out.println("plz enter number in range between "+0+" to"+s.length());
        }
       else{
        --c;
         System.out.println(s.indexOf(c));
       } 
       sc.close();

       //3Q: The substring of s consisting of its third through fifth characters
       System.out.println(s.substring(5));
       System.out.println("print substring in range:"+s.substring(4,9));
    }
}
