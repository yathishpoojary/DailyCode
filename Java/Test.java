public class Test {
    String name;

    public Test(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return "Hello "+ this.name;
    }

    public static void main(String[] args) {
//        String st = "hello";
//        System.out.println("st "+st);
//        st += "World";
//        System.out.println("st "+st);
//        System.out.println("st "+st);

        Test st = new Test("name 1");
        System.out.println(st);
        System.out.println(""+st);

    }
}
