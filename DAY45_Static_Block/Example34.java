package DAY45_Static_Block;

public class Example34 {
	static 
	{ 
	System.out.println("Static Block"); //1
	} 
	{ 
		System.out.println("Instance Block");
	} 
	Example34() 
	{ 
	System.out.println("Constructor"); 
	} 
	public static void main(String[] args) 
	{ 
	System.out.println("Main Method"); 
	        new Example34(); 
	        new Example34(); 
	} 
}
