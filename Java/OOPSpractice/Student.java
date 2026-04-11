package OOPSpractice;

import java.util.Objects;

public class Student {
    String name;
    int age;


    @Override
    public String toString() {
        return "Student name is  "+name+ " and age is "+ age;
    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals( Object o) {
        Student student = (Student ) o;
        return age ==student.age ;
    }


    public static void main( String []args) {
        Student st = new Student(12, "Yathish");
        Student st2 = new Student(12, "Yathish");

        System.out.println(" Print =>  "+st);
        System.out.println(" Print =>  "+st2);
        System.out.println(" Print => equal  "+st.equals(st2));
        System.out.println(" Print =>  == " +( st == st2));
        System.out.println(" Print =>  Objects.equals " +Objects.equals(st.name,st2.name));

    }
}
