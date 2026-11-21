public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.start();
        car.wheels();
        car.speed();
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class FourWheeler extends Vehicle {
    void wheels() {
        System.out.println("Has 4 wheels");
    }
}

class SportsCar extends FourWheeler {
    void speed() {
        System.out.println("Very fast");
    }
}
