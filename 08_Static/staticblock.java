package STATIC;


public class staticblock {
    public static void main(String[] args){
          System.out.println("i am in main function");
    }
    static{
       System.out.println("i am in static block");
    }
     void run(){
        System.out.println("i am a static function");
    }
    static{
        System.out.println("i am in second static block");
        //if we not use static function run then we have to write below two line instead of run(); to call the run fuction
    staticblock b=new staticblock();
    b.run();
    }
}