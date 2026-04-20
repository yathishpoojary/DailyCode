package Practice20th;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    String name; int age; double salary;

    public Employee(String name, int age, double salary) {
        this.name =name;
        this.age = age;
        this.salary = salary;
    }
    public double getSalary() {
        return  this.salary;
    }

    public static void main(String[] args) {

    Employee emp1 = new Employee("YAthish", 12,2300);
    Employee emp2 = new Employee("Alash", 3, 33333);
    Employee emp3 = new Employee(" Sura", 65, 3343222);
    List<Employee> list = List.of(emp1,emp2,emp3);

    List<Employee> sorted = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());

    }
}
