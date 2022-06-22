package methodoverriding;

// Method overriding and access modifiers

class Parent{
    // private methods are not overridden
    private void m1(){
        System.out.println("Method 1 from Parent class");
    }

    protected void m2(){
        System.out.println("Method 2 from Parent class");
    }
}
class Child extends Parent{
    // new method of child class because scope of private access modifier is within the class.
    // scope is in this class only to run this we have to write a code in such a way m1() get executed.
    private void m1(){
        System.out.println("Method 1 from child class");
    }
    // to override m2 of parent class we have to use access modifier of low restriction
    @Override
    public void m2() {
        System.out.println("Method 2 From child class");
    }
}
public class MethodOverridingEx2 {
    public static void main(String[] args) {
       Child c = new Child();
       c.m2();
       // c.m1(); we can't use that like this.
    }
}
