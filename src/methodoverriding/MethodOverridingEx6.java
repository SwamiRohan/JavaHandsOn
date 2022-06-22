package methodoverriding;

// If the super-class overridden method does throws an exception, subclass overriding method can only
// throw same, subclass exception. Throwing parent exception in Exception hierarchy will lead to compile time
// error.Also there is no issue if subclass overridden method is not throwing any exception.

class Q {
    void m1() throws RuntimeException
    {
        System.out.println("From parent m1()");
    }
}
class W extends Q {
    @Override
    //no issue while throwing same exception
    void m1() throws RuntimeException
    {
        System.out.println("From child1 m1()");
    }
}
class E extends Q {
    /*
    *
    @Override
    //compile-time error
    //issue while throwing parent exception
    // cannot throw higher exception from parent class exception
    void m1() throws Exception
    {
        System.out.println("From child4 m1()");
    }*/

}
public class MethodOverridingEx6 {
    public static void main(String[] args) {
        W w = new W();
        w.m1();
    }
}
