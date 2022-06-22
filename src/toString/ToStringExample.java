package toString;

// toString() is used to print the content of an Object. If toString() is not overridden in the class it would
//             print some hashcode.

public class ToStringExample {
    public static void main(String[] args) {
        Person p = new Person("Rohan");
        System.out.println(p);
    }
}
class Person{
    String name;

    Person(String n){
        name = n;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
