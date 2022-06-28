package cohesion;

class Multiply{
    public void multiply(int a, int b){
        System.out.println("Result of Multiplication is: "+ a*b);
    }
}

class Division{
    public void divide(int a, int b){
        System.out.println("Result of division is: "+ a/b);
    }
}

public class HighlyCohesiveExample {
    public static void main(String[] args) {
        Multiply multiply = new Multiply();
        multiply.multiply(10,2);
        Division div = new Division();
        div.divide(10,2);
    }
}
