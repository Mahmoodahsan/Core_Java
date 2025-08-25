package DAY46_Has_A_Relation.DAY2;

class Engine1 
{ 
void start() 
{ 
System.out.println("Engine started."); 
} 
} 
class Car1
{ 
private Engine1 engine; 
Car1() 
{ 
engine = new Engine1(); // Engine is created inside Car 
} 
void startCar() 
{ 
engine.start(); 
System.out.println("Car started."); 
} 
} 
public class Task2 
{
	public static void main(String[] args) 
	{ 
	Car1 car1 = new Car1(); 
	car1.startCar(); 
	} 
}