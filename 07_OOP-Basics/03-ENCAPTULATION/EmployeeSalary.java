class EmployeeSalary {
    private double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
public class Main3 {
    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary();
        e.setSalary(50000);
        System.out.println(e.getSalary());
    }
}
