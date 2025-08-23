package DAY45_Static_Block;

public class Example35 {
	static int x = 10; //30 
	{ 
		x = 50;
	}  
	static 
	{ 
	x = 30; 
	} 
	public static void main(String[] args) 
	{ 
	System.out.println("Before Object Creation: " + x); //30
	     new Example35(); 
	System.out.println("After Object Creation: " + x); 
	}
}
