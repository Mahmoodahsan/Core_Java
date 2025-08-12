import java.util.Scanner;
public class array{
    public static void main(String args[]){
        String []car={"MERSIDIES","BMW","THARR"};
        System.out.println(car[0]+"\n"+car[1]+"\n"+car[2]);
        System.out.println("enter the name of car");
        Scanner ke=new Scanner(System.in);
        String name=ke.next();
        System.out.println(name);
        ke.close();

    }
}