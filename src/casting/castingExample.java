package casting;

// Casting is used when we want to convert one datatype into another.
// types of casting - implicit and explicit casting

public class castingExample {
    public static void main(String[] args) {

        //Implicit casting - done by compiler, storing smaller value into larger variable type.
        int value = 50;
        long number;
        number = value; // Implicit casting (int -> long) like wise.


        // Explicit casting is done through code. Storing larger values into smaller variable types.
        // It may cause truncation of value.
        double d1 = 182.22;
        int i1 = (int)d1;// Explicit casting (double -> int) like wise.

        System.out.println(i1);
    }
}
