class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Base Salary: " + baseSalary);
    }
}

class Manager extends Employee {
    double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public void calculateSalary() {
        showDetails();
        System.out.println("Total Salary (with Bonus): " + (baseSalary + bonus));
    }
}

class Developer extends Employee {
    int projects;

    public Developer(String name, double baseSalary, int projects) {
        super(name, baseSalary);
        this.projects = projects;
    }

    public void calculateSalary() {
        double total = baseSalary + (projects * 2000);
        showDetails();
        System.out.println("Total Salary (with Project Incentives): " + total);
    }
}

public class Hierarchical4 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 50000, 10000);
        Developer d = new Developer("Bob", 40000, 3);

        m.calculateSalary();
        System.out.println();
        d.calculateSalary();
    }
}
