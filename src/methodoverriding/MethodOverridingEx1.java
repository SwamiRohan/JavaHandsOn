package methodoverriding;

// How we can override a method from other class.

class RBI{
    public void setInterest(){
        System.out.println("Interest rate should be minimum 10% ");
    }
}
class SBI extends RBI{
    @Override
    public void setInterest(){
        System.out.println("Interest rate should be 12% ");
    }
}
public class MethodOverridingEx1 {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.setInterest();
    }
}
