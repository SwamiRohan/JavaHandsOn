package cohesion;

// classes must be highly cohesive.

// MultiplyDivide class is performing two different operations that can be broken down in two different
// classes to make it more cohesive.

class MultiplyDivide{
    public void multiply(int a,int b){
        System.out.println("Result of Multiplication is: "+ a*b);
    }
    public void divide(int a,int b){
        System.out.println("Result of Division is: "+ a/b);
    }
}

public class LowCohesionExample {
    public static void main(String[] args) {
        MultiplyDivide obj = new MultiplyDivide();
        obj.multiply(10,2);
        obj.divide(10,2);
    }
}
