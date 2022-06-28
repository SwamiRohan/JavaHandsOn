package instance_of;

// instanceof operator checks is an object is of particular type.

public class InstanceOfExample {
    class A{
    };
    class B extends A{
    };
    interface C{
    };
    class D implements C{
    };

    B b = new B(); // b is an instanceof B and A
    D c = new D(); // c is an instanceof D and C

}
