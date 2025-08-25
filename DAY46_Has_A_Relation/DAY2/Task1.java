package DAY46_Has_A_Relation.DAY2;

class Engine 
{ 
void start() 
{ 
System.out.println("1"); 
} 
} 
class Car 
{ 
Engine engine = new Engine(); 
void startCar() 
{ 
engine.start(); 
System.out.println("2"); 
} 
} 
public class Task1 
{ 
public static void main(String[] args) 
{ 
Car car = new Car(); 
car.startCar(); 
} 
} 
