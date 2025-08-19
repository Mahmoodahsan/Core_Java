public class EmployeeSystem {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
      ParmanentEmployee p=new ParmanentEmployee(01,"Kalkat", 1200);
      System.out.println(p);
      p.netSalary();
      ContractEmployee c=new ContractEmployee(01,"kalkat",1200,4);
      System.out.println(c);
	}

}