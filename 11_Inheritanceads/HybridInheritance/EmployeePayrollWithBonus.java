interface Bonus {
    double calculateBonus(double salary);
}

interface Tax {
    double calculateTax(double salary);
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}

class Payroll extends Employee implements Bonus, Tax {
    public Payroll(String name, double salary) {
        super(name, salary);
    }

    public double calculateBonus(double salary) {
        return salary * 0.10;  // 10% bonus
    }

    public double calculateTax(double salary) {
        return salary * 0.05;  // 5% tax
    }

    public void showFinalSalary() {
        double bonus = calculateBonus(salary);
        double tax = calculateTax(salary);
        System.out.println(name + "'s Final Salary: " + (salary + bonus - tax));
    }
}

public class EmployeePayrollWithBonus {
    public static void main(String[] args) {
        Payroll p = new Payroll("John", 50000);
        p.showFinalSalary();
    }
}
