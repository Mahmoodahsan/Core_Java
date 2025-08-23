package DAY43_Inheritance_Mcq;

public class Task14
{ 
public static void main(String[] args) 
{ 
new A14(3); 
new B14(5, 6); 
new B14(6, 7).C14(1, 2, 3); 
new C14(3, 3, 4).B14(4, 5); 
new C14(1, 1, 1); 
} 
} 
class A14
{ 
A14(int i) 
{ 
print(i * 2); 
} 
void print(int i) 
{ 
System.out.print(i + " "); 
} 
} 
class B14 extends A14 
{ 
B14(int j, int k) 
{ 
super(j); 
print(k * 4); 
} 
void C14(int j, int k, int l) 
{ 
print(j + k + l - 3); 
} 
} 
class C14 extends B14
{ 
C14(int j, int k, int l) 
{ 
super(j, k); 
print(l - 3); 
} 
void B14(int i, int k) 
{ 
print(i * 6); 
} 
}
