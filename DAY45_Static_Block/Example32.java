package DAY45_Static_Block;

public class Example32 {
	static int x = 10; //20
	static 
	{ 
	System.out.println("Static Block 1: " + x); //1-->10
	x = m1(); 
	} 
	static 
	{ 
	System.out.println("Static Block 2: " + x); //3--> 20
	x += 5; 
	} 
	static int m1() 
	{ 
	System.out.println("m1 executed"); //2
	return 20; 
	} 
	public static void main(String[] args) 
	{ 
	System.out.println("Main: x = " + x); //4 --> 25
	} 
}