package interfaces;

// Multiple Interface implementation Example

interface X{
    void showX();
}

interface Y{
    void showY();
}

interface Z{
    void showZ();
}
public class InterfaceEx2 implements X, Y,Z  {
    public static void main(String[] args) {
        InterfaceEx2 ie2 = new InterfaceEx2();
        ie2.showX();
        ie2.showY();
        ie2.showZ();
    }
    @Override
    public void showX() {
        System.out.println("show 1");
    }
    @Override
    public void showY() {
        System.out.println("show 2");
    }
    @Override
    public void showZ() {
        System.out.println("show 3");
    }
}
