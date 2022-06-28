package interfaces;

// Multiple interface implementation with the same method name
// Note that there is only one @Override necessary!!!.
// This is because P.show() and Q.show() are "@Override-equivalent".
// Thus, ObjectReference(ie3) has only one implementation of show(), and it doesn't matter how you treat ie3,
// whether as a P or as a Q, there is only one method to invoke.

interface P{
    void show();
}

interface Q{
    void show();
}

public class InterfaceEx3 implements P, Q{
    public static void main(String[] args) {
        InterfaceEx3 ie3 = new InterfaceEx3();
        ie3.show();
    }
    @Override
    public void show(){
        System.out.println("Hello");
    }
}
