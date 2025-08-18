class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void showDetails() {
        showName();
        showSalary();
        System.out.println("Department: " + department);
    }
}

public class PersonDetails{
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 80000, "IT");
        m.showDetails();
    }
}
