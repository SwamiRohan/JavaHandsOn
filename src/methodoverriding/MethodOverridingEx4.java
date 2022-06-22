package methodoverriding;

// Static methods cannot be overridden because when we define a static method with same signature as static method
// in base class it is known as method hiding.

class A{
    static void m1(){
        System.out.println("In Parent class static method");
    }
}
class B extends A{
    static void m1(){
        System.out.println("In child class ");
    }
}
public class MethodOverridingEx4 {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
