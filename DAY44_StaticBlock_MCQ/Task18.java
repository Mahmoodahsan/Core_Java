package DAY44_StaticBlock_MCQ;

class  Alpha18        
{
   public static final int MAX_VALUE = access();

   static
	{
	   System.out.println("Static Block");
	}

    public static int access()
	{
		return 100;
	}

}
public class Task18
{
	public static void main(String[] args) 
	{
		System.out.println(Alpha18.MAX_VALUE);
	}
}
