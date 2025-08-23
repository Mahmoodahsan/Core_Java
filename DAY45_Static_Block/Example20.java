package DAY45_Static_Block;

public class Example20 
{ 
static int a; 
public static void main(String[] args) 
{ 
System.out.println(Example20.a); //0
Example20.a = Example20.initialize(); 
System.out.println(Example20.a); //60
} 
static int initialize() 
{ 
Example20.a = 50; 
return 60; 
} 
}