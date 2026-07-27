class Student {
String name;
int id;
double marks;

Student(String name,int id,double marks) {
this.name = name;
this.id = id;
this.marks = marks;
}

@Override
public String toString() {
	return this.name;
}


}

class Test01 {
public static void main(String args[]) {
	System.out.println("Hello World");
	Student st1 = new Student("Yathish high marks",1,99.9);
	Student st2 = new Student("DUmmmy",2,4.0);
	System.out.println("st1 "+st1);
}
}