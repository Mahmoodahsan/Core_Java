package DAY44_StaticBlock_MCQ;

class Demo10
{	
    static
	{   
		i = 100;		
	}

        static int i;
}

public class Task10
{
    public static void main(String[] args) 
	{
        System.out.println(Demo10.i);
	}
}

