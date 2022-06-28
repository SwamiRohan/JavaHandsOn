package interfaces;

interface Test{
    void print(String name);
}

class A implements Test{
    @Override
    public void print(String name) {
        System.out.println("Hello "+ name);
    }
}
public class InterfaceEx1 {
    public static void main(String[] args) {
        A a = new A();
        a.print("Rohan");
    }
}
