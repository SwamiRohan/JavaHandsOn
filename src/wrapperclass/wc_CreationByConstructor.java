package wrapperclass;

// First way to create wrapper class - Using wrapper class constructor.

public class wc_CreationByConstructor {
    public static void main(String[] args) {
        Integer i1 = 12;
        Integer i2 = new Integer("12"); //String argument
        //Integer i3 = new Integer("r"); Compile time error
        Float f1 = new Float(12.33); // double argument
        Float f2 = new Float(12.33f); // float argument
        Character c1 = new Character('C'); // Only character constructor
        //Character c2 = new Character(123); Compile time error (Only Character constructors is valid.

        // in Boolean "trUe" , "true", "tRUe" will be considered as true rest is false.
        Boolean b1 = new Boolean("trUe");
        Boolean  b2 = new Boolean("rohan");
        System.out.println(i1 + " " + f1+ " " + f2+ " " +c1+ " " +i2+ " " +b1+ " " +b2);
    }
}
