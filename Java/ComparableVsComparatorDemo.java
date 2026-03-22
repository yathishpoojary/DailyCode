import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int i, String name, int salary) {
        this.id=i;
        this.name  = name;
        this.salary =salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id,o.id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";

    }

}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class ComparableVsComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Employee> lst = new ArrayList<>();
        lst.add(new Employee(3,"Yathish",3400));
        lst.add(new Employee(2,"Suhas",444));
        lst.add(new Employee(5,"Raj",5545));

        System.out.println("Original list");
        lst.forEach(System.out::println);

        Collections.sort(lst);
        System.out.println("Comparable list");
        lst.forEach(System.out::println);

        Collections.sort(lst,new NameComparator());
        System.out.println("Comparator list");
        lst.forEach(System.out::println);

        lst.sort((e1,e2)->e1.salary> e2.salary?1:-1);
        System.out.println("Lamda list");
        lst.forEach(System.out::println);
    }
}
