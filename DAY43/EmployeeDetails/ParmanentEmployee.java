package DAY_43_Inheritance.EmployeeDetails;

public class ParmanentEmployee extends Employee {
	protected double providedFund=12;
	public ParmanentEmployee(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
	}
	@Override
	public String toString() {
		return "ParmanentEmployee [providedFund=" + providedFund + ", employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary + "]";
	}
	
   public void netSalary() {
	   System.out.println("net Salary is :"+(this.employeeSalary+this.employeeSalary*100/this.providedFund));
   }
}
