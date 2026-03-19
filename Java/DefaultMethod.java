interface Vehicle {
    void drive();

    default void checkLicense() {
    System.out.println(" Check license before driving ");
    }
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("I drive car");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.checkLicense();
        car.drive();
    }
}
