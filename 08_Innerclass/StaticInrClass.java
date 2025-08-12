package Innerclass;
class outer{
    int x=20;
    static int y=40;
    static class inner{
      public void show(){
        System.out.println(y);//ststic class only access static member
      }
    }
}
public class StaticInrClass {
    public static void main(String[] args){
          outer.inner o=new outer.inner();
          o.show();
    }
}