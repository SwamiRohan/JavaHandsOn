package abstraction;

abstract class Bike{
    Bike() {
        System.out.println("Bike constructor");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}

//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    public Honda(){
        System.out.println("Honda constructor");
    }
    @Override
    void run(){
        System.out.println("running safely..");
    }
}

class AbstractEx2{
    public static void main(String args[]){
        Bike obj = new Honda(); // It will print the bike and Honda constructor
        obj.run(); // Honda run()
        obj.changeGear(); // Bike changeGear()
    }
}
