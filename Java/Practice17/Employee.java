package Practice17;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
    String name;
    long salary;
    int id;

    public Employee(String name, int id, long salary) {
    this.name = name;this.id = id; this.salary= salary;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "ID: "+id+  " Salary:"+salary+" Name: "+name;
    }

    @Override
    public int compareTo(Employee o) {
        return o.name.compareTo(this.name);
//        return 0;
//        return Integer.compare(this.id, o.id);
    }

    public long getSalary() {
        return this.salary;
    }

    @Override
    public int compare(Employee em1, Employee em2) {
        return Long.compare(em1.salary, em2.salary);
    }
}
