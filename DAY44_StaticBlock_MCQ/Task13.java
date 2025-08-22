package DAY44_StaticBlock_MCQ;

class  Alpha13       
{
   public static final int A;

   static
   {
     print();
	 A = 100;
   }

   public static void print()
   {
     System.out.println("Default value :"+A);
   }
}
public class Task13 
{
	public static void main(String[] args) 
	{
		System.out.println("User value :"+Alpha13.A);
	}
}