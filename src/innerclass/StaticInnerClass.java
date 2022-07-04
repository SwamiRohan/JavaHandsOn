package innerclass;

class Outer{
    int a;
    public void show(){
        System.out.println("Outer class");
    }
    static class Inner{
        public void display(){
            System.out.println("Static Inner Class");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer(); // obj reference for outer class
        obj.show(); // method call of outer class
        Outer.Inner objInner = new Outer.Inner(); // Obj reference of inner static class
        objInner.display(); // method call of inner class
    }
}
