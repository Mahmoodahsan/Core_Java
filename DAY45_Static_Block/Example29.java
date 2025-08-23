package DAY45_Static_Block;

public class Example29 {
	int value = 50; 
	public static void main(String[] args) 
	{ 
		Example29 obj = getInstance(); 
	System.out.println(obj.value); 
	} 
	public static Example29 getInstance() 
	{ 
	return new Example29(); 
	} 
}
