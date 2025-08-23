package DAY45_Static_Block;

class Example5 {
	static int a = 5; //10 
	static 
	{ 
	System.out.println("Static Block :"+a); //3
	a = 10; 
	} 
	} 
	public class Example33 
	{ 
	static 
	{ 
	System.out.println("Example5 Static Block");//1 
	} 
	public static void main(String[] args)
	{ 
		System.out.println("Main Method"); //2
		System.out.println("Class A a :" + Example5.a); //4
		} 
}
