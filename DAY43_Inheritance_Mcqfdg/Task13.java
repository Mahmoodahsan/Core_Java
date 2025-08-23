package DAY43_Inheritance_Mcq;

class A13
{ 
int i; 
void display() 
{ 
System.out.println(i); 
} 
} 

class B13 extends A13 
{ 
int j; 
void display() 
{ 
System.out.println(j); 
} 
} 
class Task13 
{ 
public static void main(String args[]) 
{ 
B13 obj = new B13(); 
obj.i=1; 
obj.j=2; 
obj.display(); 
} 
}
