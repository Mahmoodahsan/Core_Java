package single_level_inheritance;

class Super3{
	public Super3() {
		System.out.println("i am in super3 class");
	}
}
class Sub3 extends Super3{
	public Sub3() {
		System.out.println("i am in sub3 class");
	}
}
public class SingleLevelInheritance3 {

	public static void main(String[] args) {
		// it calls both class constructor because s is object of both class
         Sub3 s=new Sub3(); 
        // s.Super3();->error it is method calling style
	}
}
