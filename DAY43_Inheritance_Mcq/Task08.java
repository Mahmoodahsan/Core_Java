package DAY43_Inheritance_Mcq;

class BaseClass 
{ 
BaseClass() 
{ 
System.out.print("*"); 
} 
BaseClass(String str) 
{ 
this(); 
System.out.print("@" + str); 
} 
} 

public class Task08 extends BaseClass 
{ 
Task08() 
{ 
System.out.print("#"); 
} 
Task08(String name) 
{ 
this(); 
System.out.print("$" + name); 
} 
public static void main(String args[]) 
{ 
 new Task08("hello");
} 
} 