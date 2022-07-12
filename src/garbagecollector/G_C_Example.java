package garbagecollector;

// Garbage collector is a name given to automatic garbage collector in java.
// The aim of garbage collector is to keep as much of heap available/free for the program as possible.
// JVM removes objects on the heap which are no longer have references from the heap.

class PrintHello{
    String name;

    public PrintHello(String name) {
        this.name = name;
    }
    void display(){
        System.out.println("Hello "+ name);
    }
}
public class G_C_Example {
    public static void main(String[] args) {
        // Object reference variable "p" is created on the heap
        PrintHello p = new PrintHello("Rohan");
        p.display();
    }
    // After function ends execution, the object reference variable "p" is no longer valid. Hence, JVM will
    // remove "p" from heap.

    // This is how garbage collector works
}
