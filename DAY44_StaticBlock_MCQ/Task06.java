package DAY44_StaticBlock_MCQ;

class Demo6
{
  public static final int VALUE;

    static 
    {
        VALUE = 50;
        System.out.println("Value is : " + VALUE);
    }
}
public class Task06
{
	public static void main(String[] args)
	{
       System.out.println("Main Method VALUE = " + Demo6.VALUE);
    }
}

