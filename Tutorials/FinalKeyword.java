package Tutorials;

abstract class Vehicle {

    public abstract void accelerate();
    public abstract void decelerate();
}

final class Car extends Vehicle {

    private final int speedLimit;

    public Car() {
        speedLimit = 200;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelerate() {}

    @Override
    public void decelerate() {}

    public final void airBags() {
        System.out.println("4 Airbags");
    }
}

class Cycle extends Vehicle {

    @Override
    public void accelerate() {}

    @Override
    public void decelerate() {}
}

// class EVCar extends Car {

    // @Override
    // public void airBags() {
        // System.out.println("2 Airbags");
    // }
// }

public class FinalKeyword {

    public void mainFunction() {

        Car c = new Car();
        c.airBags();
    }
}
