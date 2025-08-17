package day1;
import java.util.Scanner;
class Product{
	private int id;
	private String name;
	private  double price;
	private Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	} 
	//static factory method
	public static Product getProduct() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("product id :");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.println("enter product name :");
		String name=sc.nextLine();
		
		System.out.println("enter product price");
		double price=Double.parseDouble(sc.nextLine());
		
		return new Product(id, name, price);
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class Task_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter number of product object");
   int noOfObj=sc.nextInt();
   for(int i=1;i<=noOfObj;i++) {
	   Product p=Product.getProduct();
	   System.out.println(p);
   }
   sc.close();
	}

}
