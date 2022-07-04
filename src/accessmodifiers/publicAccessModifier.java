package accessmodifiers;

// public access modifier can be accessed everywhere. it has a widest scope among all other access modifier

public class publicAccessModifier {
    public static void main(String[] args) {
        X obj = new X();
        obj.display();
    }
}
