package initializationblocks;

// Static initializer : code that runs when class is loaded.

public class StaticInitializerEx {
    static int count;
    int i;

    // Static block will run only once irrespective of how many time we create an object reference of the
    // class. Static block will only run when class is loaded.
    static{
        // i=5; compile time error we can't access non static variable inside static block
        System.out.println("Static block");
        ++count;
        System.out.println("Count of Static block :" +count);
    }

    public static void main(String[] args) {
        StaticInitializerEx s1 = new StaticInitializerEx();
        StaticInitializerEx s2 = new StaticInitializerEx();
        StaticInitializerEx s3 = new StaticInitializerEx();
    }
}
