package initializationblocks;

// Instance Initializer : code that runs when new object is created

public class InstanceInitializerEx {
    static int count;
    int i;

    // This is instance initializer block runs everytime when an object is created.
    // both static and non static variables can be accessed
    {
        i=5;
        System.out.println("InstanceBlock");
        ++count;
        System.out.println("Count of Instance block :" +count);
    }

    public static void main(String[] args) {
        InstanceInitializerEx s1 = new InstanceInitializerEx();
        InstanceInitializerEx s2 = new InstanceInitializerEx();
        InstanceInitializerEx s3 = new InstanceInitializerEx();
    }
}

