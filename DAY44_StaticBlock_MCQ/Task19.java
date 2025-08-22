package DAY44_StaticBlock_MCQ;

class A19
{
    static 
    {
        System.out.println("Class A static block");
    }
}

public class Task19 
{
    static 
    {
        System.out.println("Class StaticTrick static block");
    }

    public static void main(String[] args) 
    {
        System.out.println("Main method");
    }
}
