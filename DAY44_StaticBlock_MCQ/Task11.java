package DAY44_StaticBlock_MCQ;

class Demo11 
{	
    static
	{   
		i = 100;
		//System.out.println(i); it gives an error
		System.out.println(Demo11.i);
	}
        static int i;
}
public class Task11
{
    public static void main(String[] args) 
	{
        System.out.println(Demo11.i);
	}
}
