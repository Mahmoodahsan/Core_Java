package DAY44_StaticBlock_MCQ;

public class Task05
{
    static 
    {
        System.out.println("Static Block Executed");
    }

    static void display()
    {
        System.out.println("Static Method Executed");
     }

    public static void main(String[] args)
    {
        System.out.println("Main Method Started");
        display();
    }
}