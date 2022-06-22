package methodoverloading;

// Method Overloading example using same class

class Adder{
    //different parameters with same return type
    static int add(int a, int b){
        return a+b;
    }
    //different parameters with same return type
    static int add(int a, int b, int c){
        return a+b+c;
    }

    // different return type and different data type argument
    static double add(double a,double b){
        return a+b;
    }
}
public class MethodOverloadingEx1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(5,2));
        System.out.println(Adder.add(1,2,3));
        System.out.println(Adder.add(2.3,4.5));
    }
}
