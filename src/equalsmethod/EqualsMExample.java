package equalsmethod;

// equals() is used when we compare two objects. the implementation of equals() is similar to == operator
// two object references are equal if they are pointing to same object.

public class EqualsMExample {
    public static void main(String[] args) {
       Person p1 = new Person(12);
       Person p2 = new Person(12);
       Person p3 = p1;
       System.out.println(p1.equals(p2));
       System.out.println(p1.equals(p3));
       System.out.println(p1==p2);
       System.out.println(p1==p3);
    }
}
class Person{
    int id;

    Person(int id){
        this.id = id;
    }
}
