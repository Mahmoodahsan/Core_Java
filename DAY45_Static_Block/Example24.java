package DAY45_Static_Block;

class Example24 
{ 
static
{ 
a = m1();//0 50 
} 
static int a = 80; // 0 80 130
public static void main(String[] args) 
{ 
System.out.println(a); 
} 
static 
{ 
a = a + m1(); //80+50
} 
static int m1() 
{ 
a = 30; 
return m2(); 
} 
static int m2() 
{ 
System.out.println(a); //30 1
return a + 20; 
} 
} 
