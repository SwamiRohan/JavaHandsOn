package abstraction;

abstract class Calculator{
    abstract void Adder(int i, int j);
}

public class AbstractEx1 extends Calculator{
    @Override
    void Adder(int i, int j) {
        System.out.println("Sum is :"+ (i+j));
    }

    public static void main(String[] args) {
        AbstractEx1 ab = new AbstractEx1();
        ab.Adder(2,3);
    }
}
