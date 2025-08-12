  class A{
    void add(){
        int a=5,b=7;
        System.out.println(a+b);
    }
}
     class B extends A{
        void mul(){
            int c=4,d=7;
            System.out.println(c*d);
        }
}
public class single {
    public static void main(String args[]){
        B inherit=new B();
        inherit.mul();
         inherit.add();
    }
}
