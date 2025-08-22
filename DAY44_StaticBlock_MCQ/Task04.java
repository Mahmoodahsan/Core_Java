package DAY44_StaticBlock_MCQ;

class X 
{
    static 
	{
        System.out.println("Class X Static Block");//1
    }
}

class Y extends X
{
    static
	{
        System.out.println("Class Y Static Block");//2
    }
}

public class Task04 
{
    public static void main(String[] args) 
	{
        new X();
        new Y();
        new Y();
    }
}