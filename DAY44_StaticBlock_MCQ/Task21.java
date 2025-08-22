package DAY44_StaticBlock_MCQ;

public class Task21
{
    static Task21 obj;

    static 
    {
        obj = new Task21();
        System.out.println("Static block executed");
    }

    Task21()
    {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) 
    {
        System.out.println("Main method");
    }
}
