class Super3 {
	public Super3() {
		System.out.println("i am in super3 class");
	}
}

class Sub3 extends Super3 {
	public Sub3() {
		System.out.println("i am in sub3 class");
	}
}

public class Third {

	public static void main(String[] args) {
		// it calls both class constructor because s is object of both class
		new Sub3();
		//if i write >>> Sub3 s = new Sub3();
		// s.Super3();->error it is method calling style
	}
}
