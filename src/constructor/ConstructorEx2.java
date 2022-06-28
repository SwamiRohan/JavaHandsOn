package constructor;

class Animal{
    public Animal(){
        System.out.println("Animal Constructor");
    }
}
class Dog extends Animal{
    public Dog(){
        System.out.println("In Dog Constructor");
    }
}

class Labrador extends Dog{
    public Labrador(){
        System.out.println("In Labrador Constructor");
    }
}
public class ConstructorEx2 {
    public static void main(String[] args) {
        // By this all the constructor will be invoked as they are extending each other class
        Labrador l = new Labrador();
    }
}
