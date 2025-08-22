package DAY44_StaticBlock_MCQ;

public class Task01
{
    static 
    {
        System.out.println("Static Block Executed");//1
    }
    public static void main(String[] args) 
    {
        System.out.println("Main Method Executed");//2
    }
}
