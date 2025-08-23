package DAY45_Static_Block;

class Example22 
{ 
static int x = 10; //10  110
public static void main(String[] args) 
{ 
System.out.println(Example22.m1()+ x); //220
} 
static int m1() 
{ 
x = x + 100; //10+100=110
return x; 
} 
} 

