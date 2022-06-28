package coupling;

// The classes should be loosely coupled not tightly coupled

class Vehicle {
    public void name() {
        System.out.println("It is a Vehicle....");
    }
}

class Bike {
    Vehicle v = new Vehicle();

    public void show() {
        v.name();
    }
}
public class TightCouplingEx {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.show();
    }
}
