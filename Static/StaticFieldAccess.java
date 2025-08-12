public class Sec2 {

	public static void main(String[] args) {
   Add.Adds();
	}
}
class Add{
	int a;
	int b;
	static int c;
   static void Adds() {
	 Add.c=6;
	 System.out.println("c = "+c);
	}
}