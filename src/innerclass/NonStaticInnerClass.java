package innerclass;

class Out{
    int a;
    public void show(){
        System.out.println("Outer class");
    }
    class In{
        public void display(){
            System.out.println("Non-Static Inner Class");
        }
    }
}

public class NonStaticInnerClass {
    public static void main(String[] args) {
        Out obj = new Out();
        obj.show();
        // To call inner class we need to use object of outer class
        Out.In obj2 = obj.new In(); // Object reference for non - static inner class
        obj2.display();
    }
}
