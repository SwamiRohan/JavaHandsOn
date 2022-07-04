package accessmodifiers;

// private access modifier can be accessible only within the class.
class A{
    private String name = "Rohan";
    private void display() {
        System.out.println("Hello inside display method");
    }
}

public class privateAccessModifier {
    public static void main(String args[]){
        A obj = new A();
        // Below both lines will lead to compile time error as we cannot access private access modifiers
        // from some other class

        // System.out.println(obj.name); Compile Time Error
        //obj.display(); Compile Time Error
    }
}
