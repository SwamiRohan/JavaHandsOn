package coupling;

interface Machine{
    void show();
}
class Fan implements Machine{
    @Override
    public void show(){
        System.out.println("It is a Machine...");
    }
}
class AirConditioner implements Machine{
    @Override
    public void show() {
        System.out.println("It's an air conditioner....");
    }
}
public class LooseCouplingEx {
    public static void main(String[] args) {
        Fan obj = new Fan();
        obj.show();
    }
}
