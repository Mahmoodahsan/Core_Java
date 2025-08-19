class Father {
	protected double balance = 50000;
}

class Son extends Father {
	protected double balance = 18000;

	public void getBalance() {
		System.out.println("Father Balance is : " + super.balance);// 50000
		System.out.println("Son Balance is : " + this.balance);// 18000
		System.out.println(balance);// 50000 method first give priority to local var
	}
}

public class UseSuperKeyword {
	public static void main(String[] args) {
		// it will call Son class method
		Son s = new Son();
		s.getBalance();
	}
}