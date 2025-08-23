package DAY43_Inheritance_Mcq;

class Base12 
{ 
public Base12(String s) 
{ 
System.out.println("Base class parameterized String"); 
} 
public Base12(int i) 
{ 
System.out.println("Base class parameterized int"); 
} 
} 
class Derived12 extends Base12
{ 
public Derived12(String s) 
{ 
super(s); 
System.out.println("Derived class parameterized String"); 
} 
public Derived12(int i) 
{ 
super(i); 
System.out.println("Derived class parameterized int"); 
} 
} 
public class Task12
{ 
public static void main(String[] argv) 
{ 
new Derived12("Java"); 
//new Derived(10); 
} 
}

