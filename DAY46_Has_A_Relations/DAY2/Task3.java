package DAY46_Has_A_Relation.DAY2;

class Address 
{ 
String city, state; 
Address(String city, String state) 
{ 
this.city = city; 
this.state = state; 
} 
void displayAddress() 
{ 
System.out.println(city + " " + state); 
} 
} 
class Student 
{ 
String name; 
Address address; 
Student(String name, Address address) 
{ 
this.name = name; 
this.address = address; 
} 
void displayStudent() 
{ 
System.out.println("Student"  + name); 
System.out.println("Address"+address ); 
address.displayAddress(); 
} 
}
public class Task3 
{ 
public static void main(String[] args) 
{ 
Address addr = new Address("New York"," USA"); 
Student student = new Student("John Doe", addr); 
student.displayStudent(); 
} 
} 
