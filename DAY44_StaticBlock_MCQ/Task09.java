package DAY44_StaticBlock_MCQ;

class  Alpha        
{
	static 
	{
		System.out.println("A");//1
	}
	 
	{
		System.out.println("B");//3
	}

	Alpha() 
	{	super();	
		System.out.println("C");//4
	}
}
class Beta extends Alpha
{
	static 
	{
		System.out.println("D");//2
	}
	 
	{
		System.out.println("E");//5
	}

	Beta() 
	{	
		super();
		System.out.println("F");//6
	}

}
public class Task09 
{
	public static void main(String[] args) 
	{
		new Beta(); 
	}
}
