package wrapperclass;

// Second way to create wrapper class - Using valueOf Static method.

// Advantage of using Static method to create a wrapper class is it may save your some memory.
// In case of wrapper class constructor it always create new object while using valueOf() it may return
// cached value.

public class wc_CreationByStaticMethod {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("123");
        // Integer i2 = Integer.valueOf("rohan"); it will result in number format exception.

        Integer i3 = Integer.valueOf("101",2); // it will convert the value from binary to decimal

        System.out.println(i1+"\nDecimal equivalent of 101 is "+i3);
    }
}
