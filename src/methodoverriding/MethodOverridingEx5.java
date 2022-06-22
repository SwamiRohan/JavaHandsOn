package methodoverriding;

// Method overriding and exception handling
// If the super-class overridden method does not throw an exception, subclass overriding method can only throw
// the unchecked exception, throwing checked exception(compile time - IO exception etc) will lead to
// compile-time error.

class R{
    void m1(){
        System.out.println("Parent class m1 method");
    }
    void m2(){
        System.out.println("Parent class m2 method");
    }
}
class S extends R{
    // Works fine because we can throw unchecked exception (checked exception are not allowed)
    @Override
    void m1() throws ArithmeticException{
        System.out.println("Child class m1 method");
    }

    // compile time error can't throw checked exception if parent class is not throwing any exception
    /*@Override
    void m2() throws Exception {
        System.out.println("Child class m2 method");
    }*/
}
public class MethodOverridingEx5 {
    public static void main(String[] args) {
        S s = new S();
        s.m1();
    }
}
