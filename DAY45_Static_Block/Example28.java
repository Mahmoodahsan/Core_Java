package DAY45_Static_Block;

public class Example28 {
	 int x = 10; 
	 public static void main(String[] args) 
	 { 
		 Example28 obj = passObject(null); 
	 System.out.println(obj.x); 
	 } 
	 static 
	 { 
		 Example28 t = new Example28(); 
	 System.out.print(t.x + " "); 
	 passObject(t); 
	 } 
	 public static Example28 passObject(Example28 t1) 
	 { 
		 return t1; 
	 } 
}

