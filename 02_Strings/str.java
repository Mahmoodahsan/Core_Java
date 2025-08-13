import java.util.Scanner;
public class str {
    public static void main(String args[]){
    System.out.println("enter name of student");
    Scanner obj=new Scanner(System.in);
    String name=obj.next();
    obj.close();
    System.out.println(name.replace("m","s"));
    }
}
