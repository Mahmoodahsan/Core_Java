package STATIC;
//import java.util.Scanner;
class mak{
         static void add(){
           System.out.println("i am accesing without creting object/reference");
         }
   }
   public class First {
    public static void main(String[] args){
     mak.add();
    }
}
