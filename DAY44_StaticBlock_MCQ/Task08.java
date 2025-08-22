package DAY44_StaticBlock_MCQ;

class Foo
{		
	Foo()
	{
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Instance block..");
	}

	static
	{
		System.out.println("Static block...");
	}
	
}
public class Task08 
{	
	public static void main(String [] args) 
	{		
		System.out.println("Main Method Executed ");		
	}	
}
