package DAY45_Static_Block;

class Example19 
{ 
static 
{ 
	int x = 10; 
	Example19.x = x+x; //20
} 
static int x;//10  20
public static void main(String[] args) 
{ 
System.out.println("Class Level X : "+Example19.x); //40
} 
static 
{ 
	x = x + Example19.x; 
} 
} 
