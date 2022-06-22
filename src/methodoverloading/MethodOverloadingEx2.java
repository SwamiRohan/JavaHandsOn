package methodoverloading;

//Method Overloading example with sub class

class Vehicle{
    public void Accelerate(float f){
        System.out.println("In Vehicle class "+ f);
    }
}
class Car extends Vehicle{
    public void Accelerate(int num) {
        System.out.println("In car class "+ num);
    }
}
public class MethodOverloadingEx2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        // In car we can run both Accelerate method of subclass as well as of superclass
        c.Accelerate(10);
        c.Accelerate(12.2f);
        // v.Accelerate(12.2); Compile time error
        v.Accelerate(12.3f);

    }
}
