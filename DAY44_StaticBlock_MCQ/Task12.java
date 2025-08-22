package DAY44_StaticBlock_MCQ;

class Demo12
{   
	{   
		i = 100;
		//System.out.println(i); it gives an error
		System.out.println(this.i);
	}
        int i;
}

public class Task12
{
    public static void main(String[] args) 
	{
          new Demo12();
	}
}
