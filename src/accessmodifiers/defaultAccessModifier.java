package accessmodifiers;

// default access modifier can be accessed only within the same package, if we don't specify any modifier
// by default it will be treated as default access modifier.


class defaultAccessModifier {

    // If we try to map this below method from some other package (like abstraction package it will lead
    // to an error

    void display(){
        System.out.println("Hello");
    }
}
