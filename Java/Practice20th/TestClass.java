
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.Map;
import java.util.Optional;

class TestEmployee {
	int salary;
	String name;
	String gender;
	
	TestEmployee(int salary,String name,String gender) {
	this.salary = salary;
	this.name = name;
	this.gender = gender;
	}

	public int getInteger() {
		return this.salary;
	}
	
	public String getGender() {
		return this.gender;	
	}

	@Override
	public String toString() {
	return this.name + " "+ this.salary + " "+this.gender;	
	}

}



class TestClass {
	public static void main(String[] args) {
	System.out.println("Hello");
	TestEmployee ts1 = new TestEmployee(123, "Yarrhish","Male");
TestEmployee ts2 = new TestEmployee(334,"Raahest","Female");
TestEmployee ts3 = new TestEmployee(43,"Gerer","Male");

List<TestEmployee> list = new ArrayList<TestEmployee>();
list.add(ts1);
list.add(ts2);
list.add(ts3);

System.out.println(list);


int maxSalary = list.stream().map(TestEmployee::getInteger).max(Comparator.naturalOrder()).get();
System.out.println(maxSalary);

int secondHeiestSalary = list.stream().map(TestEmployee::getInteger).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
System.out.println(secondHeiestSalary);

TestEmployee res = list.stream().sorted((a,b)->b.getInteger() - a.getInteger()).skip(1).findFirst().get();
System.out.println(res);

Map<String, Long> resp = list.stream().collect(Collectors.groupingBy(TestEmployee::getGender,Collectors.counting()));

System.out.println(resp);

Map<String, Optional<TestEmployee>> responce = list.stream()
						.collect(Collectors.groupingBy(
							TestEmployee::getGender, 														Collectors.maxBy(Comparator.comparingInt(TestEmployee::getInteger))
						));
System.out.println(responce);

}	
}