
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Comparator;

class TestEmployee {
	int salary;
	String name;
	
	TestEmployee(int salary,String name) {
	this.salary = salary;
	this.name = name;
	}

	public int getInteger() {
		return this.salary;
	}

	@Override
	public String toString() {
	return this.name + " "+ this.salary;	
	}

}



class TestClass {
	public static void main(String[] args) {
	System.out.println("Hello");
	TestEmployee ts1 = new TestEmployee(123, "Yarrhish");
TestEmployee ts2 = new TestEmployee(334,"Raahest");
TestEmployee ts3 = new TestEmployee(443,"Gerer");

List<TestEmployee> list = new ArrayList<TestEmployee>();
list.add(ts1);
list.add(ts2);
list.add(ts3);

System.out.println(list);


int maxSalary = list.stream().map(TestEmployee::getInteger).max(Comparator.naturalOrder()).get();
System.out.println(maxSalary);

}	
}