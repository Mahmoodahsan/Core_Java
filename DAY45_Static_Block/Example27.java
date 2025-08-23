package DAY45_Static_Block;

public class Example27 {
	int x = 10; 
	 public static void main(String[] args) 
	 { 
		 Example27 t1 = new Example27(); 
	 System.out.println(t1.x); 
	 } 
	 static 
	 { 
		 int x = 20; 
		 System.out.print(x + " "); 
		 } 
}
