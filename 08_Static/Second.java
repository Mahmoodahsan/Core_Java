package STATIC;

class B{
        static int a=20;
        static long c=22;
          static double k=23;
       static double access(){
         return k;
       }
    }
public class Second {
    public static void main(String[]args){
      System.out.println(B.a);
      System.out.println(B.c);
      System.out.println(B.access());
    }
}
