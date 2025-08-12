package STATIC;
class Stat{
    //static member access by all object of the same class.it is member of the class it cant be change by using any object
    static int a=5;
    int b=4;
    void run(){
        System.out.println("i am non static method");
    }
    static void add(){
        System.out.println("i am static method");
        //static method can only access the static member means we cant use b in place of a in below line
        System.out.println(a);
    }
}
public class Accessstatic {
    public static void main(String [] args){
     Stat ob=new Stat();
     Stat obj=new Stat();
     //System.out.println(ob.b);
     System.out.println(Stat.a);//5
     ob.a=9;

     
     System.out.println(Stat.a);//9
     Stat.a=7;
     System.out.println(Stat.a);//7
     obj.a=98;
     System.out.println(Stat.a);//98
    
    }
    
}
