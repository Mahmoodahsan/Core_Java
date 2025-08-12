public class First {

	public static void main(String[] args) {
		new B();
	}

}
class B{
    public B(){
    	this(6);
      System.out.println("i am called");
  }
    public B(int a){
         System.out.println("i am calledbys");
     }
}