package factorymethod;

import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int nofObj=Integer.parseInt(scanner.nextLine());
         for(int i=0;i<nofObj;i++) {
        	 Fact fact=Fact.Factory();
        	 System.out.println(fact);
         }
         scanner.close();
	}

}
class Fact{
	 private int age;
	private String name;
	Fact(int age,String name){
		this.age=age;
		this.name=name;
	}
	public static Fact Factory() {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter name : ");
		 String name=scanner.nextLine();
		System.out.print("enter age : ");
		int age=Integer.parseInt(scanner.nextLine());
		return new Fact(age,name);
	}
	@Override
	public String toString() {
		return "Fact [age=" + age + ", name=" + name + "]";
	}
	
}