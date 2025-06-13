package Tutorials;

class Base {
    public void message() {
        System.out.print("Welcome to Base class");
    }
}

class Derived extends Base {
    @Override
    public void message() {
        System.out.print("Welcome to Derived class");
    }
}

public class MethodOverriding {

    public void mainFunction() {

        Derived d = new Derived();
        d.message();
    }
}
