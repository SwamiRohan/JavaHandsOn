package methodoverriding;

// Final in method overriding - if we don't want a method to be overridden we will declare it as final.

class P{
    // final method can't be overridden
    final void m1(){
        System.out.println("This is a Final method ");
    }
}
class C extends P{
    // it will lead to an error
    /*@Override
    public void m1(){
        System.out.println("This is m1() from C class");
    }*/
}
public class MethodOverridingEx3 {
    public static void main(String[] args) {
        P p = new P();
        p.m1();
    }
}
