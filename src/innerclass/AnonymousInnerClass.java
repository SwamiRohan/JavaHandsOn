package innerclass;

interface A{
    void show();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj; // Just a reference
        obj = new A()
        {
            @Override
            public void show() {
                System.out.println("Inside Anonymous Inner Class");
            }
        };
        obj.show();
    }
}
