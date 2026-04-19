package Practice17;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String []args) {
        Employee emp1 = new Employee("Yathish" , 12, 23000);
        Employee emp2 = new Employee( "Test Employee", 24, 19000);
        Employee emp3 = new Employee("Suleman", 11, 30000);

        List<Employee> list = new ArrayList<>();
        list.add(emp1);list.add(emp3);list.add(emp2);

//        Collections.sort(list , new Employee());
//        list.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        Collections.sort(list);
        list. forEach(System.out::println);


        // First highest salary
        Optional<Employee> result = list.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list2 -> list.stream()
                                .filter(e -> e.getSalary() !=
                                        list.get(1).getSalary())   // exclude highest salary
                                .findFirst()
                ));

        System.out.println(" Result "+ result);







    }
}
