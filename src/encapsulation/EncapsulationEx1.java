package encapsulation;

// Approach One

class Name{
    String name;
}
public class EncapsulationEx1 {
    public static void main(String[] args) {
        Name n = new Name();
        n.name = "Rohan";
        System.out.println("My name is :"+ n.name);
    }
}
