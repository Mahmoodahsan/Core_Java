 import java.util.Scanner;
  public class STRING_all {
    public static void main(String args[]){
     Scanner obj=new Scanner(System.in);
     System.out.println("enter name of person");
    String name=obj.next();
    String REPLACE=name.replace("hm","s");
    char CHAR=name.charAt(2);
    int INDEX=name.indexOf("h");
    String TRIM=name.trim();
    int LASTINDEX=name.lastIndexOf("o");
    System.out.println(REPLACE);
    System.out.println(CHAR);
   System.out.println(TRIM);
   System.out.println(INDEX);
   System.out.println(LASTINDEX);
   obj.close();
    }
}
