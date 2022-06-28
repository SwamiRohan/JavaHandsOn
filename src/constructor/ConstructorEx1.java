package constructor;

// Default constructor Example - provided by compiler having the same name as class name

public class ConstructorEx1 {
    // In this case compiler will not provide the default constructor since we have provided it
    public ConstructorEx1(){
        System.out.println("In ConstructorEx1 class constructor");
    }

    public static void main(String[] args) {
        ConstructorEx1 ce1 = new ConstructorEx1();
    }
}
