package DAY44_StaticBlock_MCQ;

class  Alpha17        
{
   public static final int MAX_VALUE = 100;

   static
	{
	   System.out.println("Static Block");
	}
}
public class Task17 
{
	public static void main(String[] args) 
	{
		System.out.println(Alpha17.MAX_VALUE);
	}
}