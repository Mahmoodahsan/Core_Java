package DAY45_Static_Block;

public class Example31 {
	static int a = m1(); 
	static int m1() 
	{ 
	System.out.println("m1 ca led"); 
	return 30; 
	} 
	static 
	{ 
	System.out.println("Static block executed"); 
	a += 20; 
	} 
	public static void main(String[] args) 
	{ 
	System.out.println("Final value of a: " + a); 
	} 
}
