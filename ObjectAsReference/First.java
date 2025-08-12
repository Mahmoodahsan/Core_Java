public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Product p1=new Product();
 System.out.println(p1);
//  p1=new Product();
//  System.out.println(p1);
  Product p2=new Product(p1);
  System.out.println(p2);
	}

}
class Product{
	int a;
	int b;
	public Product(){
		System.out.println("hello p");
	}
	public Product(Product p1){
		System.out.println("hello");
	}
}