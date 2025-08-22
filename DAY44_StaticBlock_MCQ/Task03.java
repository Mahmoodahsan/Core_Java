package DAY44_StaticBlock_MCQ;

class Demo 
{
	{
		System.out.println("Non Static Block in Demo");
	}

    public Demo() 
	{
        System.out.println("Constructor of Demo");
    }

	static 
	{
        System.out.println("Static Block in Demo");
    }
}

public class Task03
{
    public static void main(String[] args) 
	{       
        new Demo();
        new Demo();
    }
}