package DAY44_StaticBlock_MCQ;

class Sample
{	
	static 
	{
		System.out.println("Static Block");//1
		x = m1();	
		System.out.println(Sample.x);
	}
	
	public static int m1()
	{
	   System.out.println("Static Method");//2
	   return 100;	
	}
		
	static int x; 
}


public class Task15
{
	public static void main(String[] args) 
	{
		System.out.println(Sample.x);
	}
}