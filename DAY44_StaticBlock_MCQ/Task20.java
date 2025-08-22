package DAY44_StaticBlock_MCQ;

class Parent 
{
    static 
    {
        System.out.println("Parent static block");
    }
}

class Child extends Parent 
{
    static 
    {
        System.out.println("Child static block");
    }

    public static void hello()
    {
        System.out.println("Hello from Child");
    }
}

public class Task20
{
    public static void main(String[] args) 
    {
        Child.hello();
    }
}