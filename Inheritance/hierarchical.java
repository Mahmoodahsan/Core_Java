class First{
    int add(){
        int a=65,b=6;
        System.out.println(a+b);
        return 0;
    }
}
class Second extends First
{
    void mul(){
        int c=6,d=9;
        System.out.println(c*d);
    }
}
class Third extends First
{
    void read(){
        System.out.println("hello ,how can i help you");
    }
}
public class hierarchical {
    public static void main(String args[]){
        Third K=new Third();
        K.read();
         K.add();
         Second H=new Second();
          H.mul();
          H.add();
    }
}
