package autoboxing;

// Autoboxing is automatic conversion made by java compiler to convert primitive type to corresponding wrapper
// class object and reverse is known as unboxing.

public class autoboxingExample {
    public static void main(String[] args) {
        // Two wrapper objects created using new are not same objects.
        Integer i1 = new Integer(123);
        Integer i2 = new Integer(123);

        System.out.println(i1==i2); // it will give false
        System.out.println(i1.equals(i2)); // it will result in true


        // Two wrapper objects created using boxing are same objects.
        Integer i3 = 123;
        Integer i4 = 123;

        System.out.println(i3==i4); // it will result in true
        System.out.println(i3.equals(i4)); // it will result in true
    }
}
