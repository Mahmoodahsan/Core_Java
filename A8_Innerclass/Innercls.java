package Innerclass;
    class outer{
        int a=20;
        static int c=5;
        class INNER{
            int d=39;
            void InnerDisplay(){
                System.out.println("i am in inner class");
            }
        }
        void outerDisplay(){
            System.out.println("i am in outer class");
            INNER ob=new INNER();
            ob.InnerDisplay();
            System.out.println(ob.d);
        }
       
        
    }
public class Innercls {
    public static void main(String args[]){
       outer ob=new outer();
       System.out.println(ob.a);
       System.out.println(outer.c);
       ob.outerDisplay();
    }
}
