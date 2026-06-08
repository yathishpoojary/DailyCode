package Practice8th;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    int salary;
    String dept;

    public Employee(int i, String name, int salary,String dept) {
        this.id =i;
        this.name =name;
        this.salary = salary;
        this.dept= dept;
    }

    public int getSalary() {
        return this.salary;
    }

    public String toString( ){
        return this.id + " "+ this.name + " "+ this.salary;
    }

    public String  getDept() {
        return this.dept;
    }
}

public class FindHeigest2Salaries {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Aythish",123 ,"Bank");
        Employee emp2 = new Employee(2,"sathis",343,"Bank");
        Employee emp3 = new Employee(3,"rajesh",232,"Bank");
        Employee emp4 = new Employee(4,"suresh",55,"Hotel");
        Employee emp5 = new Employee(5,"Ramesj",2,"Hotel");
        Employee emp6 = new Employee(6,"Mitun",454, "Fal");

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp2);
        list.add(emp1);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);

      Optional<Integer> res=  list.stream().map(Employee::getSalary).findFirst();
      System.out.println("FIND FIRST"+res);
      List<Employee> res2 = list.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
      System.out.println("SOrt "+res2);


        Map<String, Long> res22 = list.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println(" Res "+res22);






    }
}
