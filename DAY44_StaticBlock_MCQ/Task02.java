package DAY44_StaticBlock_MCQ;
class A 
{
    static 
    {
        System.out.println("Class A Static Block");//1
    }
}

class B extends A 
{
    static 
    {
        System.out.println("Class B Static Block");//2
    }
}

public class Task02 
{
    public static void main(String[] args)
    {
         new B();//START
        System.out.println("Main Method");//3
    }
}