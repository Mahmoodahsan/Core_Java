package Innerclass;
interface My{
    public void show();
}
class outer{
    public void display(){
        My m=new My(){    //anonymous class
         public void show(){
            System.out.println("hello");
         }
        };
        m.show();
    }
}
public class AnonymIntrfce {
    public static void main(String[] args){
       outer o=new outer();
       o.display();
    }
}