package DAY46_Has_A_Relation.DAY3;

class Engine{
	private String model; 
	private int engineCapacity;
	
	public Engine(String model, int engineCapacity) {
		this.engineCapacity=engineCapacity;
		this.model=model;
		if(engineCapacity<0) {
			System.err.print("Error invalid input");
			System.exit(0);
		}
	}
	public String getModel() {
		return this.model;
	}
	public int getEngineCapacity() {
		return this.engineCapacity;
	}
	@Override
	public String toString() {
		return "Engine [model=" + model + ", engineCapacity=" + engineCapacity + "]";
	}
	
}
class Car{
	private String make;
	private String model;
	private int year;
	private Engine engine;
	public Car(String make, String model, int year,Engine engine) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.engine=new Engine(this.model, this.year);
		System.out.println(this.engine);
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", engine=" + engine + "Capacity="+engine.getEngineCapacity()+"]";
	}
  
}

public class TestCar {
  public static void main(String []args) {
	  Engine engine = new Engine("V6 Hybrid", 3000); 
	  Car car = new Car("Toyota", "Camry", 2023, engine); 
	  System.out.println(car);
  }
}
