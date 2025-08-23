package DAY45_Static_Block;

public class Example21 
{ 
static int x = Example21.m1(); 
public static void main(String[] args) 
{ 
System.out.println(Example21.x); //20
} 
static int m1() 
{ 
x = 10; 
return Example21.m2(); 
} 
static int m2() 
{ 
System.out.println(Example21.x); //10
return 20; 
} 
} 
