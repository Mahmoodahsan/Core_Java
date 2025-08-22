package DAY44_StaticBlock_MCQ;

public class Task22
{
    static final int X;
    static final int Y;

    static 
    {
        X = 5;
    }
    static
    {
        Y = 10;
    }
    public static void main(String[] args)
    {
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
    }
}