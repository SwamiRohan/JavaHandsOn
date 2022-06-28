package varags;

// When our parameter of a method are not fixed. So, instead of creating methods for different parameters
// we can use varargs
// Syntax:  (int ... n) here n will be treated as array

class Add{
    public int adder(int ... n){
        int sum = 0;
        for (int i : n){
            sum = sum + i;
        }
        return sum;
    }
}
public class VaragsExample {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println("Adding three numbers " +a.adder(10,2,3));
        System.out.println("Adding four numbers " + a.adder(2,3,5,10));
        System.out.println("Adding five numbers "+a.adder(5,5,5,5,5));
    }
}
