package NUMBETR_IN_JAVA;

public class Number_int {
   public static void main(String args[]){
    Integer i=new Integer(3);
    //it gives true in the form of binary digit(0||1)
    System.out.println(i.compareTo(3));
    System.out.println(i.intValue()+i.floatValue());
    //it gives True value in the form of of (true||false)
   System.out.println(i.equals(5));
   System.out.println(Math.abs(i));
   System.out.println(Math.floor(6.4));
   System.out.println(Math.min(4, 3));
   System.out.println(Math.sqrt(10));
   System.out.println("*****log table from 1 to 10*****");
   for(int k=0;k<=10;k++){
    System.out.println(Math.log10(k));
   }
   }
}
